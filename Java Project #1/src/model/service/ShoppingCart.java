package model.service;
import model.Food;

import java.util.ArrayList;

public class ShoppingCart {

    private People user;   // приватное поле user типа People

    protected ArrayList<Food> foodItems;  //создаем поле foodItems который хранит массив обьектов foodItems типа Food[]
    // public int i;   //поле целочисленное
    // public int [] d;  //поле которое будет являться целочисленным массивом
    public ShoppingCart (ArrayList<Food> foodItems) {        //
        this.foodItems = foodItems;  //поля обьект

    }
    public double getItemsSum() {   //метод возвращает общую сумму товаров , не имеет параметров ()
        /* double sum = 0.0;   //локальная переменная, дробное значение
            for (int i = 0; i <= this.foodItems.length; i++) {    // цикл будет итерировать массив товаров
                sum = foodItems.amount * foodItems.price + sum;   //
            }
            return sum;  */

        double allSum = 0.0;   // создается локальная переменная allSum

        for (Food food : this.foodItems) {   // цикл перебирает значения массива
           allSum += food.getAmount() * food.getPrice();  // this.foodItems[i] - доступ к каждому элементу в корзине(массив), поочередно
        }
        return allSum;
    }
    public double getItemsSumSale() {    // сумма товаров в корзине с учетом скидки
        double allSum  = 0;

        for (Food food : this.foodItems) {   //перебирает массив
            allSum += this.getItemSum(food) - (this.getItemSum(food)) /100 * food.getDiscount();  // сумма конткретного обьекта в корзине без скидки   this.foodItems[i]- конкретный обьект  this.foodItems - вся корзина
        }
        return allSum;
    }
    private double getItemSum(Food item) {    // параметр-(тип название)
        return item.getAmount() * item.getPrice();   // количество * цену
    }
    public double getSumVegetarianNoSale() {
        double allSum = 0;

        for (Food food : this.foodItems) {
            if (food.getIsVegeterian()) {        //вернет true или false
            allSum += food.getAmount() * food.getPrice();
            }
        }
        return allSum;
    }

    public void setUser(People user) {  //параметр user типа People
        this.user = user;  // сеттер, полю user присвает параметр user
    }
    public String getUserFullName() {
        return this.user.getFirstName() + " " + this.user.getLastName() + " " + this.user.getPatronymic();   //через user вызываем класс People и получаем геттеры
    }
}


