package JavaConceptsExamples;

public class Abstraction {

    public static void main(String[] args) {

        Rectangle recArea = new Rectangle(1.1,1.2);
        recArea.draw();
        System.out.println("Rectangle area "+recArea.calArea());
    }
}
