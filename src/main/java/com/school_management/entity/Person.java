package com.school_management.entity;

import java.util.UUID;

public abstract class Person {
    protected UUID id;
    protected String name;
    protected int age;

    public Person() {

    }

    public Person(String name, int age) {
        id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
