package com.example.bananos.model;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    private ArrayList<GroceryItem> groceryList;

    public ItemList() {
        groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Banana", 2.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Apple", 1.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Mango", 3.59, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Chicken", 12.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Butter", 3.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Pizza", 7.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Cheese", 5.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Juice", 6.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Bread", 2.49, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Cake", 10.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Eggs", 5.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Rice", 10.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Flour", 12.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Tea", 8.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Coffee", 8.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Yogurt", 4.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Potato", 5.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Onion", 6.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Corn", 6.99, "lbs", "Costco"));
        groceryList.add(new GroceryItem("Pasta", 5.99, "lbs", "Costco"));
        /////
        groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Banana", 3.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Apple", 2.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Mango", 1.59, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Chicken", 8.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Butter", 2.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Pizza", 9.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Cheese", 7.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Juice", 1.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Bread", 1.49, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Cake", 8.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Eggs", 2.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Rice", 8.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Flour", 21.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Tea", 12.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Coffee", 0.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Yogurt", 2.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Potato", 2.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Onion", 2.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Corn", 1.99, "lbs", "Superstore"));
        groceryList.add(new GroceryItem("Pasta", 1.99, "lbs", "Superstore"));
        ////
        groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Banana", 2.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Apple", 1.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Mango", 8.59, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Chicken", 6.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Butter", 2.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Pizza", 8.76, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Cheese", 7.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Juice", 2.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Bread", 1.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Cake", 9.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Eggs", 3.29, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Rice", 18.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Flour", 11.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Tea", 3.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Coffee", 1.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Yogurt", 9.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Potato", 6.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Onion", 1.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Corn", 9.99, "lbs", "Safeway"));
        groceryList.add(new GroceryItem("Pasta", 6.99, "lbs", "Safeway"));
    }

    public ArrayList getList() {
        return groceryList;
    }

    private List<String> getNames() {
        List<String> itemNames = new ArrayList<String>();
        for (GroceryItem groceryItem : groceryList) {
            itemNames.add(groceryItem.getName());
        }
        return itemNames;
    }

    public Boolean isValidItemName(String name) {
        return getNames().contains(name);
    }

}
