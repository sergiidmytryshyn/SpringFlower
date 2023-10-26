package com.example.demo.store;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.filters.SearchFilter;
import com.example.demo.item.Item;

import lombok.Getter;

public class Store {
    @Getter
    private List<Item> items;
    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            if (searchFilter.match(item)) {
                items.add(item);
            }
        }
        return foundItems;
    }
}