package LearingJava;

import java.util.*;

public class BirthdayCakeCandles {
    public static int findNoOfTallestCandles(List<Integer> candles) {
        int maxValue =  Collections.max(candles);
        int maxValueCount = 0;
        for (int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == maxValue){
                ++maxValueCount;
            }
        }
        return maxValueCount;
    }

    public static void main(String[] args) {
        findNoOfTallestCandles(new ArrayList<Integer>(Arrays.asList(1,4,2,3,1,4)));
    }
}
