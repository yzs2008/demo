package com.example.spring.learn.demo.model;

public class Student {

    private School school;

    private ClassRoom classRoom;

    private String name;

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        String myIntroduction = String.format("Hello my name is %s, come from class %s at %s",
                name, classRoom.getName(), school.getName());
        System.out.println(myIntroduction);
    }

    public final void testReplaceMethod() {
        this.displayInfo();
    }
}
