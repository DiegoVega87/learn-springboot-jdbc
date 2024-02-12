package com.learnspringjdbc.example.learnspringbootjdbc.jdbc;

import com.learnspringjdbc.example.learnspringbootjdbc.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate; // JdbcTemplate is a class provided by Spring to make it easier to work with JDBC

    // Add the preformatted SQL queries as constants
    private static final String INSERT_QUERY = """
            INSERT INTO person (id, name, birth_date, address, city, state)
        VALUES(?, ?, ?, ?,?,?)
        """;
    private static final String DELETE_QUERY = """
            DELETE FROM person WHERE id = ?
        """;

    private static final String SELECT_QUERY = """
            SELECT *
            FROM person
            Where id = ? """;

    // Add the methods to interact with the database
    public void insert(Person person){
        System.out.println("Num of rows affected: " + jdbcTemplate.update(INSERT_QUERY, person.getId(), person.getName(), person.getBirthdate(),
                person.getAddress(), person.getCity(), person.getState()));
    }

    public void deleteById(int id){
         jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Person findById(int id){
        //ResultSet -> Bean -> RowMapper
        return jdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Person.class), id);
    }

}
