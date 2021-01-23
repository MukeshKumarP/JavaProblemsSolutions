package StringManipulation;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] str){

        String firstChar = str[0];
        System.out.println("firstChar :: "+firstChar);
        Arrays.sort(str);

        int end = Math.min(str[0].length(),str[str.length-1].length());
        int i = 0;
        while (i < end && str[0].charAt(i) == str[str.length-1].charAt(i) ){
            i++;
            String prefix = str[0].substring(0,i);
            System.out.println(prefix);
        }
        return "";
    }

    public static void main(String[] args) {
        findLongestCommonPrefix(new String[]{"flower","flick", "flight"});
    }
}
