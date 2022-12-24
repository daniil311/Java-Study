package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {  //наследуем классу Apple класс Food (команда extends)
    private String colour;
    public Apple (int amount, double price, String colour, int id){   //создаем конструктор метод Apple и соответств. параметры
        this.isVegetarian = true;
        this.amount = amount;            //поля класса
        this.price = price;
        this.colour = colour;
        this.id = id;

    }
    public double getDiscount(){              // метод getDiscount
        if (this.colour == Colour.RED) {
            return Discount.DISCOUNT_SIXTY;   // возвращаем константу  DISCOUNT_SIXTY
        }
        return Discount.DISCOUNT_ZERO;    // возвращаем константу  DISCOUNT_ZERO
    }
}
