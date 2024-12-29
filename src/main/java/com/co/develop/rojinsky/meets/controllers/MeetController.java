package com.co.develop.rojinsky.meets.controllers;

import com.co.develop.rojinsky.meets.models.Meet;
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

    private static final List<Meet> meets = new ArrayList<>();

    static {
        for(int i = 0; i < 5; i++){
            meets.add(new Meet(i, "Meet: " + i, ZonedDateTime.now().plusDays(i)));
        }
    }

    @GetMapping
    public String getAllMeets(Model model){
        model.addAttribute("meets", meets);
        return "meets";
    }
}
