package arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        plusOne(new int[]{0,0});
    }

    private static int[] plusOne(int[] digits) {
        String temp = "";
        for (int i = 0; i < digits.length; i++) {
            temp = temp+String.valueOf(digits[i]);
        }
        System.out.println("before ::"+temp);
        System.out.println(temp);
        temp=String.valueOf(Long.parseLong(temp)+1);
        System.out.println(temp);
        int[] abc = new int[temp.length()];

        char[] ch = temp.toCharArray();
        for (int j = 0; j < ch.length; j++) {
            abc[j]=  (int) Long.parseLong(String.valueOf(ch[j]));
        }

        for (int a: abc
             ) {
            System.out.println(a);
        }
        return abc;
    }

}
