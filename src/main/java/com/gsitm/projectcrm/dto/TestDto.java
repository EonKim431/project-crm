package com.gsitm.projectcrm.dto;

import lombok.Data;

@Data
public class TestDto {
    private String player;
    private int age;

    @Override
    public String toString() {
        return "TestDto{" +
                "player='" + player + '\'' +
                ", age=" + age +
                '}';
    }
}
