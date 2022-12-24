public abstract class Mammals extends Animal {
    protected double size;
    protected String color;
    protected boolean isHungry;

    public Mammals(boolean isPredator, String title, int age, boolean isPoikilotherm, double size, String color) {
        super(isPredator, title, age, isPoikilotherm);
        this.size = size;
        this.color = color;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
}

