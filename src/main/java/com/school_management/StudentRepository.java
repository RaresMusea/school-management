package com.school_management;

import com.school_management.entity.Course;
import com.school_management.entity.Student;

import java.util.List;
import java.util.UUID;

public class StudentRepository {

    //Temporary data
    List<Student> students;

    public StudentRepository() {
        students = List.of(new Student("Michael Johnson", 19), new Student("John Doe", 23), new Student("Marcel Moore", 20));
    }

    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public void attendCourse(UUID studentId, Course course){
        List<Student> result = students.stream().filter(s->s.getId().equals(studentId)).toList();

        if(result.isEmpty()) {
            System.err.println("The student with id "+ studentId.toString() + " was not found!");
        }

        result.getFirst().getCourses().add(course);
        System.out.println("Student with id " + studentId + " was successfully enrolled to course entitled " + course.getName());
    }

    public void abortCourse(UUID studentId, Course course) {
        List<Student> targetStudent = students.stream().filter(s->s.getId().equals(studentId)).toList();

    }
}
