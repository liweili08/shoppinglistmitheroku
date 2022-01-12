package com.example.shoppinglistmitheroku.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListItem {
    private String itemName;
    private String itemKey;
    private int itemQuantity;
}
