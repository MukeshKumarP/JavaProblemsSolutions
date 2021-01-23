package JavaConceptsExamples;

public class Rectangle extends Shape{

    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calArea() {
        return length*breadth;
    }
}
