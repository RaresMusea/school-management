package com.school_management.entity;

import java.time.ZonedDateTime;

public class Grade {
    private int value;
    private ZonedDateTime dateEarned;

    public Grade() {
        value = 0;
        dateEarned = ZonedDateTime.now();
    }

    public Grade(int value, ZonedDateTime dateEarned) {
        this.value = value;
        this.dateEarned = dateEarned;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ZonedDateTime getDateEarned() {
        return dateEarned;
    }

    public void setDateEarned(ZonedDateTime dateEarned) {
        this.dateEarned = dateEarned;
    }
}
