package ru.job4j.restapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ru.job4j.restapi.domains.Person;
import ru.job4j.restapi.services.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class PersonController {
    private final PersonService personService;
    private final BCryptPasswordEncoder encoder;

    public PersonController(PersonService personService, BCryptPasswordEncoder encoder) {
        this.personService = personService;
        this.encoder = encoder;
    }

    @GetMapping
    public List<Person> findAll() {
        return personService.findAllPerson();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable(required = true) Integer id) {
        Optional<Person> person = personService.findPersonById(id);
        return new ResponseEntity<>(
                person.orElse(new Person()),
                person.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND
        );
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody Person person) {
        person.setPassword(encoder.encode(person.getPassword()));
                personService.createPerson(person);
    }
}
