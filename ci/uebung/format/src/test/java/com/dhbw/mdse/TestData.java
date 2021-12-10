package com.dhbw.mdse;

import com.dhbw.mdse.domain.engineer.Engineer;
import com.dhbw.mdse.domain.engineer.Software;
import com.dhbw.mdse.domain.student.Course;
import com.dhbw.mdse.domain.student.Student;

import java.util.Arrays;
import java.util.List;

public class TestData {

    public static Student student() {
        List<Course> courses = Arrays.asList(new Course("mdse", "presentation"), new Course("java", "test"));
        return new Student("Max Muster", 22, "DHBW Mannheim", courses);
    }

    public static Engineer engineer() {
        List<Software> software = Arrays.asList(new Software("Linux", "GPL v2"), new Software("Git", "GPL v2"));
        return new Engineer("Linus Torvalds", 48, software);
    }
}
