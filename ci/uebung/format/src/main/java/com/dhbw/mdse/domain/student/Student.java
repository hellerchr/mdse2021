package com.dhbw.mdse.domain.student;

import java.util.List;
import java.util.StringJoiner;

public class Student {
    private String name;
    private Integer age;
    private String university;
    private List<Course> courses;

    public Student() {
    }

    public Student(String name, Integer age, String university, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("university='" + university + "'")
                .add("courses=" + courses)
                .toString();
    }
}
