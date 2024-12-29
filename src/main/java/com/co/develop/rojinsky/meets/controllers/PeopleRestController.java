package com.co.develop.rojinsky.meets.controllers;

import com.co.develop.rojinsky.meets.models.People;
import com.co.develop.rojinsky.meets.services.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PeopleRestController {

    private PeopleService peopleService;

    public PeopleRestController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }
    @GetMapping
    public List<People> getAllPeople(){
        return peopleService.getAllPeople();
    }
}
