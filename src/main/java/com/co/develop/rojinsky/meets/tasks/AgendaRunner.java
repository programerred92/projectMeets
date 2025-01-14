package com.co.develop.rojinsky.meets.tasks;

import com.co.develop.rojinsky.meets.services.MeetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AgendaRunner implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(AgendaRunner.class);
    @Autowired
    private MeetService meetService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOG.info("Presentation of agenda");
        meetService.getAllMeets().forEach(meet -> {
            LOG.info(meet.toString());
        });
        LOG.info("End of agenda");
    }
}
