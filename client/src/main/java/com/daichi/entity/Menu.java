package com.daichi.entity;

import lombok.Data;

@Data
public class Menu {
    private Long id;
    private String name;
    private Double price;
    private String flavor;
    private Type type;
}
