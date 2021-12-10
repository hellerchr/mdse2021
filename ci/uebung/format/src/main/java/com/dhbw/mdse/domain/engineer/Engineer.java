package com.dhbw.mdse.domain.engineer;

import java.util.List;

public class Engineer {
    public String name;
    public Integer age;
    private List<Software> software;

    public Engineer() {
    }

    public Engineer(String name, Integer age, List<Software> software) {
        this.name = name;
        this.age = age;
        this.software = software;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Software> getSoftware() {
        return software;
    }
}
