package com.co.develop.rojinsky.meets.services;

import com.co.develop.rojinsky.meets.data.MeetRepository;
import com.co.develop.rojinsky.meets.models.Meet;
import com.co.develop.rojinsky.meets.models.People;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MeetService {

    private final MeetRepository meetRepository;

    public MeetService(MeetRepository meetRepository) {
        this.meetRepository = meetRepository;
    }

    public List<Meet> getAllMeets(){
        return meetRepository.findAll();
    }
}
