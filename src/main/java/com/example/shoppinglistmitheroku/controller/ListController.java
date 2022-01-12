package com.example.shoppinglistmitheroku.controller;

import com.example.shoppinglistmitheroku.model.ListItem;
import com.example.shoppinglistmitheroku.service.ListService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//@RequestMapping("")
public class ListController {
    public final ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping
    public ArrayList<ListItem> getAll(){
        return listService.getAllItems();
    }

    @PostMapping ListItem postAddItem(@RequestBody ListItem itemToAdd){
        return listService.addItem(itemToAdd);
    }

    @PutMapping
    public ListItem putIncreaseQuantity(@PathVariable String itemKey, @RequestBody ListItem itemToIncrease){
        return listService.increaseQuantity(itemKey,itemToIncrease);
    }

    @PutMapping
    public ListItem putDecreaseQuantity(@PathVariable String itemKey, @RequestBody ListItem itemToDecrease){
        return listService.decreaseQuantity(itemKey,itemToDecrease);
    }

    @DeleteMapping
    public ListItem deleteItem(@PathVariable String itemKey){
        return listService.removeItem(itemKey);
    }


}
