package one.dio.restapi.controller;

import one.dio.restapi.dto.MessageResponseDTO;
import one.dio.restapi.entity.Person;
import one.dio.restapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personService.createPerson(person);
        return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getId()).build();
    }
}
