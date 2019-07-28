package com.tripper.entity;

import javafx.scene.text.Text;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Calendar startAt;
    private Calendar endAt;
    private String title;
    private String description;

    // This constructor is never directly used. It only exists for the sake of JPA.
    protected Event() {}

    public Event(Calendar startAt, Calendar endAt, String title, String description) {
        this.startAt = startAt;
        this.endAt = endAt;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public Calendar getStartAt() {
        return startAt;
    }

    public void setStartAt(Calendar startAt) {
        this.startAt = startAt;
    }

    public Calendar getEndAt() {
        return endAt;
    }

    public void setEndAt(Calendar endAt) {
        this.endAt = endAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
