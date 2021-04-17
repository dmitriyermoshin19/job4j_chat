package ru.job4j.restapi.services;

import org.springframework.stereotype.Service;
import ru.job4j.restapi.domains.Person;
import ru.job4j.restapi.domains.Role;
import ru.job4j.restapi.repositpries.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void createPerson(Person person) {
        person.setRole(new Role(1, "user"));
        personRepository.save(person);
    }

    public Optional<Person> findPersonById(Integer id) {
        return personRepository.findById(id);
    }

    public List<Person> findAllPerson() {
        return personRepository.findAll();
    }
}
