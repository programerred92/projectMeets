package com.co.develop.rojinsky.meets.services;

import com.co.develop.rojinsky.meets.data.PeopleRepository;
import com.co.develop.rojinsky.meets.models.People;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<People> getAllPeople(){
        return peopleRepository.findAll();
    }
}
