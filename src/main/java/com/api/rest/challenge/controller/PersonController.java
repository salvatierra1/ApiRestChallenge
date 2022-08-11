package com.api.rest.challenge.controller;

import com.api.rest.challenge.dto.PersonDTO;
import com.api.rest.challenge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDTO>save(@Valid @RequestBody PersonDTO person){
        return  ResponseEntity.status(HttpStatus.OK).body(personService.save(person));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonDTO>edit(@Valid @PathVariable Long id, @Valid @RequestBody PersonDTO person){
        return  ResponseEntity.status(HttpStatus.OK).body(personService.edit(id,person));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>save(@Valid @PathVariable Long id){
        personService.delete(id);
        return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
