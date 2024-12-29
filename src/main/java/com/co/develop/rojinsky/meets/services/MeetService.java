package com.co.develop.rojinsky.meets.services;

import com.co.develop.rojinsky.meets.models.Meet;
import com.co.develop.rojinsky.meets.models.People;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MeetService {
    private static final List<Meet> meets = new ArrayList<>();

    static {
        for(int i = 0; i < 5; i++){
            Meet meet = new Meet(i, "Meet: " + i, ZonedDateTime.now().plusDays(i));
            for (int j = 0; j < i; j++) {
                meet.addAssistant(new People(i+j, "Name "+i+j, "Lastname "+i+j));
            }
            meets.add(meet);
        }
    }

    public List<Meet> getAllMeets(){
        return meets;
    }
}
