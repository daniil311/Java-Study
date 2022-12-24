public class Main {
    public static void main(String[] args) {
        Main t = new Main("Peregruzka constructora");

        Dog obj1 = new Dog();
        obj1.bark(1, "dog");
        obj1.bark( "dog",2.2);
    }
    public Main() {
        System.out.println("Hi, iam constructor Main");
    }
    public Main(String x) {
        System.out.println(x);
    }
}
class Dog {
    public void bark(int y, String s){
        System.out.println("Gav gav");
    }
    public void bark(String s, double y){
        System.out.println("гав - гав");
    }
}
