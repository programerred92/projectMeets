package com.co.develop.rojinsky.meets.controllers;

import com.co.develop.rojinsky.meets.models.Meet;
import com.co.develop.rojinsky.meets.models.People;
import com.co.develop.rojinsky.meets.services.MeetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/meets")
public class MeetController {
    @Autowired
    private MeetService meetService;
    @GetMapping
    public String getAllMeets(Model model){
        model.addAttribute("meets", meetService.getAllMeets());
        return "meets";
    }
}
