package com.example.springboot;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class ClientAccount {
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public String getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(String reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private String createdBy;
    private String title;
    private String description;
    private String reminderDateTime;
    private java.util.Date createdDateTime;
    private boolean active;

    public String getCreatedDateTime() {
        return createdDateTime.toString();
    }

    public void setCreatedDateTime() {
        this.createdDateTime = new java.util.Date();
    }

    public ClientAccount(String createdBy, String title, String description, String reminderDateTime, boolean active) {
        this.createdBy = createdBy;
        this.title = title;
        this.description = description;
        this.reminderDateTime = reminderDateTime;
        this.active = active;

    }


}
