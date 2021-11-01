package com.inseong.demo.domain.user;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getUsers(){
        return personRepository.findAll();
    }
}
