package com.learnspringjdbc.example.jdbc;

import com.learnspringjdbc.example.entities.Person;
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

    }
}
