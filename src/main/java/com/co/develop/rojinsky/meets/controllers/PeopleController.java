package com.co.develop.rojinsky.meets.controllers;

import com.co.develop.rojinsky.meets.models.People;
import com.co.develop.rojinsky.meets.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @GetMapping
    public String getAllPeople(Model model){
        model.addAttribute("people", peopleService.getAllPeople());
        return "people";
    }
}
