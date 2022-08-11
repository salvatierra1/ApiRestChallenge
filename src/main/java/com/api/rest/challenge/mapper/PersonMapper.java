package com.api.rest.challenge.mapper;

import com.api.rest.challenge.dto.PersonDTO;
import com.api.rest.challenge.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public Person DtoToEntity(PersonDTO dto) {
        Person person = new Person();
        person.setName(dto.getName());
        person.setLastname(dto.getLastname());
        person.setDni(dto.getDni());
        person.setEmployee(dto.getEmployee());
        return person;

    }
    public PersonDTO EntityToDto(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        personDTO.setLastname(person.getLastname());
        personDTO.setDni(person.getDni());
        personDTO.setEmployee(person.getEmployee());
        return personDTO;

    }

}
