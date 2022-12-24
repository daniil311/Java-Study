package model;

public abstract class Food implements Discountable {   //подключение интерфейса -implements Discountable
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected int id;

    public double getDiscount() {    //реализация метода, описали метод
        return 0.0;
    }

    public int getAmount() {  //метод getter  - возврат значения, создаем геттер потому что amount и price protected
        return this.amount;
    }
    public double getPrice() {
        return this.price;
    }
    public boolean getIsVegeterian() {
        return this.isVegetarian;
    }
}
