package LearingJava;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class SumPalindromeNums {

    static int sumPalindrome(int[] arr){
int finalSum = 0;
        LinkedList<Integer> as = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(reverse(arr[i]) == arr[i]){
                finalSum+=arr[i];
            }

        }
        System.out.println(finalSum);
        return 0;
    }

    static int reverse(int a) {
        String temp = String.valueOf(a);
        char[] ch = temp.toCharArray();
        String reverseValue="";

        for (int j = ch.length-1; j >=0 ; j--) {
            reverseValue+=ch[j];
        }
       // System.out.println(reverseValue);
        return Integer.valueOf(reverseValue);
    }

    public static void main(String[] args) {
        sumPalindrome(new int[]{1,121,1221,45});
    }
}
