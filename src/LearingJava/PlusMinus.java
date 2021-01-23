package LearingJava;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PlusMinus {
    public static void findPlusMinus(int[] arr){
        int arrayLength = arr.length;
        double positiveElementsCount = 0;
        double zeroElementsCount = 0;
        double negativeElementsCount = 0;
        for (int i = 0; i < arrayLength; i++) {
            if(arr[i] > 0 ){
                ++positiveElementsCount;
            }else if (arr[i]==0) {
                ++zeroElementsCount;
            } else {
                ++negativeElementsCount;
            }
        }
        System.out.println(String.format("%.6f",positiveElementsCount/arrayLength));
        System.out.println(String.format("%.6f",negativeElementsCount/arrayLength));
        System.out.println(String.format("%.6f",zeroElementsCount/arrayLength));
    }

    public static void main(String[] args) {
        findPlusMinus(new int[]{1,2,-1,-1,0,1});
    }
}
