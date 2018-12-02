package com.example.configuration;

import lombok.Data;

@Data
public class People {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
