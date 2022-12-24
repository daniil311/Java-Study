public class Fish extends Animal {
    private double dwellingDepth;

    public Fish(boolean isPredator, String title, int age, boolean isPoikilotherm){
        super(isPredator, title, age, isPoikilotherm);  //вызываем конструктор родительского класса
    }
}
