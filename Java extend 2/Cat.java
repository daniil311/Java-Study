public class Cat extends Mammals {
    private boolean isShortHaired;
    private boolean isMeows;

    public Cat(boolean isPredator, String title, int age, boolean isPoikilotherm, double size, String color) {
        super(isPredator, title, age, isPoikilotherm, size, color);
    }

    public void setIsShortHaired(double size) {
        if (size > 5) {
            this.isShortHaired = true;
        } else {
            this.isShortHaired = false;
        }
    }

}