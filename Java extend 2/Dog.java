public class Dog extends Mammals {
    private boolean isfightingDog;
    private String securityObject;

    public Dog(boolean isPredator, String title, int age, boolean isPoikilotherm, double size, String color, boolean isfightingDog) {
        super(isPredator, title, age, isPoikilotherm, size, color);
        this.isfightingDog = isfightingDog;
    }

    public String bark() {
        if (this.size > 20) {
            return "Гав-Гав";
        } else {
            return "гав - гав";
        }
    }

    public void guard(String securityObject) {
        this.securityObject = securityObject;
    }
}