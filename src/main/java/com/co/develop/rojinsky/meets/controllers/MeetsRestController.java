package com.co.develop.rojinsky.meets.controllers;

import com.co.develop.rojinsky.meets.models.Meet;
import com.co.develop.rojinsky.meets.services.MeetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meets")
public class MeetsRestController {

    private MeetService meetService;

    public MeetsRestController(MeetService meetService) {
        this.meetService = meetService;
    }

    @GetMapping
    public List<Meet> getAllMeets(){
        return meetService.getAllMeets();
    }
}
