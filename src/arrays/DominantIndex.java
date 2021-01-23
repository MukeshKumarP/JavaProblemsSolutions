package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DominantIndex {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1,2,4,4,2}));
    }

    private static int dominantIndex(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int finalValue1 = 0;
        int finalValue2 = 0;

        HashMap<Integer, Integer> ab = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > maxValue){
                ab.clear();
                maxValue = nums[j];
                ab.put(maxValue, j);
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != maxValue & maxValue >= nums[i]*2){
                finalValue1 = ab.get(maxValue);
            }else if(nums[i] == maxValue){

            }
            else  {
                finalValue2 = -1;
            }
        }
        if(finalValue2 == -1){
            return finalValue2;
        }else{
            return finalValue1;
        }
    }
}
