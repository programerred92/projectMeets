package com.co.develop.rojinsky.meets.tasks;

import com.co.develop.rojinsky.meets.services.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DirectoryRunner implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(DirectoryRunner.class);

    @Autowired
    private PeopleService peopleService;
    @Override
    public void run(String... args) throws Exception {
        LOG.info("People directory");
        peopleService.getAllPeople().forEach(person->{
            LOG.info(person.toString());
        });
        LOG.info("End directory");
    }
}
