package com.school_management.entity;

import java.util.Collections;
import java.util.List;

public class Student extends Person {
    private List<Course> courses;

    public Student() {
        super();
        courses = Collections.emptyList();
    }

    public Student(String name, int age, List<Course> courses) {
        super(name, age);
        this.courses = courses;
    }

    public Student(String name, int age) {
        super(name, age);
        this.courses = Collections.emptyList();
    }

    public List<Course> getCourses() {
        return courses;
    }
}
