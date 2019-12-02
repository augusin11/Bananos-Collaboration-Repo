package  com.example.sixhourgrind.stringParser;

import com.example.sixhourgrind.model.GroceryItem;

import java.util.ArrayList;
import java.util.List;

class FindCheapestStore {

    private List<GroceryItem> groceryItemList;

    //constructor
    public FindCheapestStore(List<GroceryItem> groceryItemList) {
        this.groceryItemList = groceryItemList;
    }

    //given a list of all matching items from all stores, method returns the name of the store where the total price of
    //all required items is the cheapest
    public String getCheapestStore() {
        List<String> storesList = new ArrayList<>();

        for (GroceryItem groceryItem : groceryItemList) {
            if (!storesList.contains(groceryItem.getStore())) {
                storesList.add(groceryItem.getStore());
            }
        }

        Double minPrice = 500000.0;
        String store = "error";
        Double price = 0.0;

        List<GroceryItem> temporaryList = new ArrayList<>();

        for (String storeName : storesList) {
            for (GroceryItem groceryItem : this.groceryItemList) {
                if (groceryItem.getStore().equals(storeName)) {
                    temporaryList.add(groceryItem);
                }
            }
            for (GroceryItem groceryItem : temporaryList) {
                price += (groceryItem.getPrice() * groceryItem.getQuantity());
            }
            if (price < minPrice) {
                minPrice = price;
                store = storeName;
            }
        }
        return store;
    }
}
