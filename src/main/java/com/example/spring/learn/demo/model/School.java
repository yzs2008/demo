package com.example.spring.learn.demo.model;

import java.util.List;

public class School {

    private List<ClassRoom> classRoomList;

    private String name;

    public List<ClassRoom> getClassRoomList() {
        return classRoomList;
    }

    public void setClassRoomList(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
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
