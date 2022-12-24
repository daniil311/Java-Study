package model.service;
import model.Food;
import java.util.ArrayList;
import model.service.ShoppingCart;

public class TestShoppingCart {
    protected ArrayList<Food> foodItems;
    //public TestShoppingCart(Food[] foodItems) {
        //super(foodItems);   //вызов родительского класса

    public TestShoppingCart(ArrayList<Food> foodItems){
        this.foodItems = foodItems;
        }

    public void addItem(Food item) {
        this.foodItems.add(item);
    }

    public int count() {
        return this.foodItems.size();

    }
}
