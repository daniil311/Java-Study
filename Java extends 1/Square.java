public class Square extends Figure{
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double sideFour;

    public Square(double sideOne, double sideTwo, double sideThree, double sideFour){
        if (sideOne == sideTwo && sideThree == sideFour && sideTwo == sideThree){
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
            this.sideFour = sideFour;
        } else {
            System.out.println("Error incorrect input data Square");
        }

    }

    public double perimetr(){
        return this.sideOne + this.sideTwo + this.sideThree + this.sideFour;
    }
    public double area(){
        return this.sideOne * this.sideTwo;
    }
}
