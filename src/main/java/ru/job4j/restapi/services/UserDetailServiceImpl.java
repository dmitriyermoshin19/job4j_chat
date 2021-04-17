package ru.job4j.restapi.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.job4j.restapi.domains.Person;
import ru.job4j.restapi.repositpries.PersonRepository;

import java.util.Collections;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private final PersonRepository repository;

    public UserDetailServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        List<Person> users = repository.findByUsername(username);
        if (users.isEmpty()) {
            throw new UsernameNotFoundException(username);
        }
        Person person = users.get(0);
        return new User(person.getUsername(), person.getPassword(), Collections.emptyList());
    }
}
