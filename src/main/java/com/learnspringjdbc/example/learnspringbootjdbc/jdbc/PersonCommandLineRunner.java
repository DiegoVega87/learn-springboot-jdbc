package com.learnspringjdbc.example.learnspringbootjdbc.jdbc;

import com.learnspringjdbc.example.learnspringbootjdbc.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonCommandLineRunner implements CommandLineRunner {

    @Autowired
    private PersonJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------LAUNCHING COMMAND LINE RUNNER-------------");
        repository.insert(new Person(1, "Diego", "1980-01-01", "1234 Main St",
                "Springfield", "IL"));
        repository.insert(new Person(2, "Angie", "1982-02-01", "1234 Blackwell St",
                "Springfield", "IL"));
        repository.insert(new Person(3, "Clara", "1973-01-01", "1234 Suits St",
                "Springfield", "IL"));

        repository.deleteById(1);

        System.out.println("Person with id 2: " + repository.findById(2));

        repository.findAll().forEach(System.out::println);

    }
}
