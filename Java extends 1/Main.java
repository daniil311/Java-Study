public class Main {
    public static void main(String[] args){
        Square obj1 = new Square(7,7,8,8); //обьект класса Square
        Square obj2 = new Square(7,8,8,7);
        Square obj3 = new Square(8,7,7,8);
        Square obj4 = new Square(5,5,5,5);

        Rectangle obj5 = new Rectangle(5,4,5,4);
        Rectangle obj6 = new Rectangle(5,5,4,4);
        Rectangle obj7 = new Rectangle(4,4,4,4);


        System.out.println(obj1.area());
        System.out.println(obj1.perimetr());

        System.out.println(obj2.area());
        System.out.println(obj2.perimetr());

        System.out.println(obj3.area());
        System.out.println(obj3.perimetr());

        System.out.println(obj4.area()+" "+"Raschet Area Square");
        System.out.println(obj4.perimetr()+" "+"Raschet Perimetr Square");

        System.out.println(obj5.area()+" "+"Raschet Area Rectangle");
        System.out.println(obj5.perimetr()+" "+"Raschet Perimetr Rectangle");

        System.out.println(obj6.area());
        System.out.println(obj6.perimetr());

        System.out.println(obj7.area());
        System.out.println(obj7.perimetr());
    }
}
