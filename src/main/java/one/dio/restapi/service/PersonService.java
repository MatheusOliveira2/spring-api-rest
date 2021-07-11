package one.dio.restapi.service;

import one.dio.restapi.dto.MessageResponseDTO;
import one.dio.restapi.dto.request.PersonDTO;
import one.dio.restapi.entity.Person;
import one.dio.restapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(PersonDTO personDTO){
        return personRepository.save(person);
    }
}
