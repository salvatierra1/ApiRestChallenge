package com.api.rest.challenge.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="person")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastname;

    private String dni;

    private Boolean employee;

    public Person() {
    }

    public Person(Long id, String name, String lastname, String dni, Boolean employee) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.employee = employee;
    }

}
