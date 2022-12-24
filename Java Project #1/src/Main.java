import model.Food;
import model.Apple;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;
import model.service.People;
import model.service.TestShoppingCart;

import java.util.ArrayList;
import java.util.Properties;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100.0, 1);
        Apple redapple = new Apple(10, 50.0, Colour.RED, 2);
        Apple greenapple = new Apple(8, 60.00, Colour.GREEN, 3);
        People vasia = new People("Vasia", "Svetliy","Alekseevich");

        ArrayList<Food> foodList = new ArrayList<Food>(); // ArrayList в котором хранятся продукты для передачи в ShoppingCart
        foodList.add(meat);
        foodList.add(redapple);
        foodList.add(greenapple);
        ShoppingCart box = new ShoppingCart(foodList);
        System.out.println(box.getItemsSum());
        System.out.println(box.getItemsSumSale());
        System.out.println(box.getSumVegetarianNoSale());

        /*
        listfood.add(meat);
        listfood.add(greenapple);
        listfood.add(redapple);
        TestShoppingCart testCard = new TestShoppingCart(listfood);
        testCard.addItem(testApple.count);
        //System.out.println(testCard.);
        System.out.println(listfood.size());

        Food[] foodList = {meat, redapple, greenapple};   //создаем массив типа Food , который хранит продукты

        ShoppingCart box = new ShoppingCart(foodList);  //создание корзины
        box.setUser(vasia);   //человек присвается корзине (аргумент)

        System.out.println(box.getItemsSum());
        System.out.println(box.getItemsSumSale());
        System.out.println(box.getSumVegetarianNoSale());

        Test4 obj1 = new Test4();    //экземпляр класса Test4, обьект-переменная obj1
        obj1.metod1(-95);    // вызов метода с передачей Аргумента

        System.out.println(box.getItemsSumSale());

         */
    }
}
class Test {
    public int test;  // поле test
    public void showLocalVariable() {
        int peremennaya1 = 10;
        System.out.println(peremennaya1);
    }
}
class Test2 extends Test{    //класс Test2 будет наследоваться(extends) от класса Test

}

class TestTest {
    public int num;
    public void test_hello() {
        System.out.println("hello");
    }
}
class Test4 {
    public void metod1(int num){    //(тип параметра метода) - Параметр
        System.out.println(num);
    }

}
