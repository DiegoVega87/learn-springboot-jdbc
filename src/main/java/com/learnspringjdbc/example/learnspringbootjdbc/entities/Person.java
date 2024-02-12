package com.learnspringjdbc.example.learnspringbootjdbc.entities;

import org.springframework.stereotype.Component;

public class Person {
    
    private long id;
    private String name;
    private String birthdate;
    private String address;
    private String city;
    private String state;

    public Person() {
    }
    
    public Person(long id, String name, String birthDate, String address, String city, String state) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = birthDate;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
