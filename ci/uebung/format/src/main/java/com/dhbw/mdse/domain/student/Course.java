package com.dhbw.mdse.domain.student;

import java.util.StringJoiner;

public class Course {
    String name;
    String examType;

    public Course() {
    }

    public Course(String name, String examType) {
        this.name = name;
        this.examType = examType;
    }

    public String getName() {
        return name;
    }

    public String getExamType() {
        return examType;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Course.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("examType='" + examType + "'")
                .toString();
    }
}
