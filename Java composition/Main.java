public class Main {
    public static void main (String[] args){

        Steam obj11 = new Steam();

        Test objX = new Test();
        Test objY = new Test();

        System.out.println(objX.x);
        System.out.println(objY.x);

        Item[] items = {new Item("table"), new Item("both")};
        Room r1 = new Room(5, items);
        Room r2 = new Room(5, new Item[]{new Item("table"), new Item("both")});

        Item[] itemsOne = {new Item("table"), new Item("char"), new Item("bed")};
        Item[] itemsTwo = {new Item("lamp"), new Item("sofa")};
        Item[] itemsThree = {new Item("tv"), new Item("picture")};

        Room roomOne = new Room(50, itemsOne);
        Room roomTwo = new Room(20,itemsTwo);
        Room roomThree = new Room(30,itemsThree);

        House home1 = new House(roomOne, roomTwo, roomThree);

        System.out.println(home1);

        System.out.println(home1.getAreaHouse());

        System.out.println(home1.getRoomOne().getItemsRoom());

        Item[] items1 = home1.getRoomOne().getItemsRoom();
        for (Item itemName : items1) {
            System.out.println(itemName);
        }

        Item[] test = home1.getItemAllRooms();

        for (Item itemsname : test) {
            System.out.println(itemsname);
        }

        Item[] arr2 = new Item[2];
        arr2[0] = new Item("df");

        for(Item i : arr2){
            System.out.println(i);
        }

        int[] arrInt = {1, 2, 3};
        for(int d : arrInt) {
            System.out.println(d);
        }

        Item[] items2 = home1.getAllItemsRoom();
        for ( Item i : items2){
            System.out.println(i.getName());
        }


        System.out.println(home1.getItemsCount());

        Item obj1 = ItemBuilder.createItem("table");




        C objC = new C();
        A two = new A(2);
        Cartoon nextCartoon = new Cartoon();
        Chess objChess = new Chess();

        Steam objStem = new Steam();
    }
}
class A extends B{
    A(int b){
        super(b);
        System.out.println("A()");
    }
}
class B{

    B(int b){
        System.out.println("B()");
    }
}
class C extends A {
    private static final int b = 10;
    B example = new B(7);

    C() {
        super(b);
    }
}

class Art{
    Art(){
        System.out.println("Art()");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing()");
    }
}
class Cartoon extends  Drawing{
    Cartoon(){
        System.out.println("Cartoon");
    }
}
class Game{
    Game(int i){
        System.out.println("Game("+ i + ")");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame("+ i + ")");
    }
}
class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess()");
    }
}
class Root{
    Component1 comp1 = new Component1();
    Component2 comp2 = new Component2();
    Component3 comp3 = new Component3();
    Root(){
        System.out.println("Root()");
    }
}
class Component1{
    Component1(){
        System.out.println("Component1()");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2()");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3()");
    }
}
class Steam extends Root{
    Steam(){
        System.out.println("Steam()");
    }
}
