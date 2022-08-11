package com.api.rest.challenge.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PersonDTO {

    private Long id;

    @NotBlank(message = "the name cannot be empty or null")
    private String name;

    @NotBlank(message = "the lastname cannot be empty or null")
    private String lastname;

    @NotBlank(message = "the dni cannot be empty or null")
    private String dni;

    @NotNull(message = "employee cannot be null")
    private Boolean employee;
    public PersonDTO() {
    }

    public PersonDTO(Long id, String name, String lastname, String dni, Boolean employee) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.employee = employee;
    }

}
