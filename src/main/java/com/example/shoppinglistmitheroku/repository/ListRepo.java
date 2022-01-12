package com.example.shoppinglistmitheroku.repository;

import com.example.shoppinglistmitheroku.model.ListItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ListRepo {
    public final ArrayList<ListItem> shoppingList;

    public ListRepo(ArrayList<ListItem> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public ArrayList<ListItem> returnAll() {
        // System.out.println(shoppingList);
        return shoppingList;
    }

    public ListItem addItem(ListItem itemToAdd) {
        shoppingList.add(itemToAdd);
        return itemToAdd;
    }

    private ListItem findByKey(String itemKey) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (itemKey.equals(shoppingList.get(i).getItemKey())) {
                return shoppingList.get(i);
            }
        }return null;
    }

    public ListItem removeItem(String itemKey) {
        ListItem item = findByKey(itemKey);
        shoppingList.remove(item);
        return item;
    }


    public ListItem increaseQuantity(String itemKey, ListItem itemToIncrease) {
        removeItem(itemKey);
        addItem(itemToIncrease);
        return itemToIncrease;
    }

    public ListItem decreaseQuantity(String itemKey, ListItem itemToDecrease) {
        removeItem(itemKey);
        addItem(itemToDecrease);
        return itemToDecrease;
    }
}