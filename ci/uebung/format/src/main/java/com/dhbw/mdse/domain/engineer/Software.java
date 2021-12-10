package com.dhbw.mdse.domain.engineer;

public class Software {
    private String name;
    private String license;

    public Software() {
    }

    public Software(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }
}
