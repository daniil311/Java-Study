package model;

public class Meat extends Food {  //наследуем класс Food (команда extends)
    public Meat (int amount, double price, int id){    //создаем класс Meat
        this.isVegetarian = true;
        this.amount = amount;  //обращение к полю amount класса= присваем параметр amount
        this.price = price;
        this.id = id;
    }
}
