package com.example.spring.learn.demo.model;

import java.util.List;

public class ClassRoom {
    private List<Student> studentList;

    private String name;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+ name);
    }
}
