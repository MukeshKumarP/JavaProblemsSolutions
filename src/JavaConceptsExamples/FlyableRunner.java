package JavaConceptsExamples;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyable = {new Bird(), new Airoplane()};

        for(Flyable object : flyable) {
            object.fly();
        }

    }
}
