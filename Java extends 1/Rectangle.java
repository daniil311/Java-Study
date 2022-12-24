public class Rectangle extends  Figure{
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double sideFour;

    public Rectangle(double sideOne, double sideTwo, double sideThree, double sideFour) {
        if (sideOne == sideThree && sideTwo == sideFour && sideOne != sideTwo && sideThree != sideFour) {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
            this.sideFour = sideFour;
        } else {
            System.out.println("Error incorrect input data Rectangle");
        }

    }
    public double area(){
        return this.sideOne * this.sideTwo;
    }
    public double perimetr() {
            return this.sideOne + this.sideTwo + this.sideThree + this.sideFour;
    }
}
