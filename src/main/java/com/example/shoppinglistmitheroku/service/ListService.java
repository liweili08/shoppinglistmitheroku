package com.example.shoppinglistmitheroku.service;

import com.example.shoppinglistmitheroku.model.ListItem;
import com.example.shoppinglistmitheroku.repository.ListRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ListService {
    public final ListRepo listRepo;

    public ListService(ListRepo listRepo) {
        this.listRepo = listRepo;
    }

    public ArrayList<ListItem> getAllItems() {
        return listRepo.returnAll();
    }

    public ListItem addItem(ListItem itemToAdd) {
        return listRepo.addItem(itemToAdd);
    }

    public ListItem increaseQuantity(String itemKey, ListItem itemToIncrease) {
        return listRepo.increaseQuantity(itemKey,itemToIncrease);
    }

    public ListItem decreaseQuantity(String itemKey, ListItem itemToDecrease) {
        return listRepo.decreaseQuantity(itemKey,itemToDecrease);
    }

    public ListItem removeItem(String itemKey) {
        return listRepo.removeItem(itemKey);
    }
}
