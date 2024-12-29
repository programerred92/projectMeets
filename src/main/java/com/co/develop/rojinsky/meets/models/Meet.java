package com.co.develop.rojinsky.meets.models;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Meet {
    private long id;
    private String topic;
    private ZonedDateTime date;
    private List<People> assistants = new ArrayList<>();
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public Meet(){
    }

    public Meet(long id, String topic, ZonedDateTime date){
        this.id = id;
        this.topic = topic;
        this.date = date;
    }

    public List<People> getAssistants() {
        return assistants;
    }

    public void addAssistant(People assistant) {
        assistants.add(assistant);
    }
}
