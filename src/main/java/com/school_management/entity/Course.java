package com.school_management.entity;

import java.util.Collections;
import java.util.List;

public class Course {
    private String name;
    private List<Grade> grades;

    public Course() {
        name = "";
        grades = Collections.emptyList();
    }

    public Course(String name, List<Grade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
