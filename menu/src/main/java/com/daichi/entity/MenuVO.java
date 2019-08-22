package com.daichi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private Integer code;
    private String msg;
    private Integer count;
    private List<Menu> data;
}
