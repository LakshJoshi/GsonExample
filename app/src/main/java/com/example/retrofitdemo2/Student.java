package com.example.retrofitdemo2;

public class Student {
    String name,department,college;

    Faculty faculty;

    public Student(String name, String department, String college, Faculty faculty) {
        this.name = name;
        this.department = department;
        this.college = college;
        this.faculty = faculty;
    }
}
