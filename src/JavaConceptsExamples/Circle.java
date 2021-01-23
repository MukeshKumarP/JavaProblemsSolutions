package JavaConceptsExamples;


import JavaConceptsExamples.Shape;

public class Circle extends Shape {

    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return 3.14*radius*radius;
    }
}
