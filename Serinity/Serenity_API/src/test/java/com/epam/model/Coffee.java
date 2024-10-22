package com.model;


import lombok.Data;

import java.util.List;
@Data
public class Coffee {
    private String title;
    private String description;
    private List<String> ingredients;
    private String image;
    private int id;
}
