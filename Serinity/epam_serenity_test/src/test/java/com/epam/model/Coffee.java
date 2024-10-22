package com.epam.model;


import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Coffee {
    private String title;
    private String description;
    private List<String> ingredients;
    private String image;
    private int id;
    private Ingredient ingredient;
}
