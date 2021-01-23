package LearingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static List<Integer> calGrading(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int templ = grades.get(i);
            if (templ >= 38) {
                if (templ % 5 != 0) {
                    int tempRemainder = templ % 5;
                    if ((5 - tempRemainder) < 3) {
                        result.add(templ + (5 - tempRemainder));
                    }else {
                        result.add(templ);
                    }
                }else {
                    result.add(templ);
                }
            }else {
                result.add(templ);
            }
        }
        result.forEach(System.out::println);
        return result;
    }


}
