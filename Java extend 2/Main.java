public class Main {
    public static void main(String[] args){
    Cat cat1 = new Cat(false, "Tom",5,true, 3.5,"Yellow");
    Dog dog1 = new Dog(true,"Sharik",8, false,5.2,"Grey",true);
    Fish fish1 = new Fish(false,"Salmon",2,true);

    System.out.println(cat1.title+" "+cat1.age+" "+cat1.color);
    System.out.println(dog1.title+" "+dog1.age+" "+dog1.color);
    System.out.println(fish1.title+" "+fish1.age);
    }
}
