package com.api.rest.challenge.service.impl;

import com.api.rest.challenge.dto.PersonDTO;
import com.api.rest.challenge.mapper.PersonMapper;
import com.api.rest.challenge.model.Person;
import com.api.rest.challenge.repository.PersonRepository;
import com.api.rest.challenge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDTO save(PersonDTO dto) {
        Person person = personRepository.save(personMapper.DtoToEntity(dto));
        return personMapper.EntityToDto(person);
    }
    @Override
    public PersonDTO edit(Long id, PersonDTO person) {
        Person entity = this.getPersonEdit(id);
        entity.setName(person.getName());
        entity.setLastname(person.getLastname());
        entity.setDni(person.getDni());
        entity.setEmployee(person.getEmployee());
        return personMapper.EntityToDto(personRepository.save(entity));
    }
    Person getPersonEdit(Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person.get();
    }
    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }

}
