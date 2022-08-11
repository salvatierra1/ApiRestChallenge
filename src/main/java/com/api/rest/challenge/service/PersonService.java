package com.api.rest.challenge.service;

import com.api.rest.challenge.dto.PersonDTO;

public interface PersonService {
    PersonDTO save(PersonDTO person);
    PersonDTO edit(Long id, PersonDTO person);
    void delete(Long id);

}
