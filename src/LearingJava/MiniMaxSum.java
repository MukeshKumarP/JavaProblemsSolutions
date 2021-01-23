package LearingJava;

import java.util.ArrayList;
import java.util.Collections;

public class MiniMaxSum {

    public static void findMiniMaxSum(int[] arr){
        ArrayList<Long> newArray = new ArrayList<>();
        long tempValue = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    tempValue = tempValue+arr[j];
                }
            }
            newArray.add(tempValue);
            tempValue = 0;
        }
        System.out.println(Collections.min(newArray)+" "+Collections.max(newArray));
    }

    public static void main(String[] args) {
        findMiniMaxSum(new int[]{1,2,3,4,1,3});
    }
}
