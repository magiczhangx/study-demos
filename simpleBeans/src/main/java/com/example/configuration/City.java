package com.example.configuration;

import lombok.Data;

@Data
public class City {

    String name;

    Integer population;

    String area;

    @Override
    public String toString() {
        return "City{   " +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area='" + area + '\'' +
                '}';
    }
}
