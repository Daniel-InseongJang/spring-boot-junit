package com.inseong.demo.domain.user;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("")
    public List<Person> getUsers() {
        return personService.getUsers();
    }
}
