package com.co.develop.rojinsky.meets.services;

import com.co.develop.rojinsky.meets.models.People;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PeopleService {

    private static final List<People> people = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++) {
            People person = new People(i, "Name " + i, "Lastname " + i);
            people.add(person);
        }
    }

    public List<People> getAllPeople(){
        return people;
    }
}
