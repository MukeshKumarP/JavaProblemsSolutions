package LearingJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubstring {

    static final int NO_OF_CHARS = 256;

    public static int getLongestSubstring(String str) {

        char[] chars = str.toCharArray();
        String long_str = null;
        int str_length = 0;
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = chars[i];
            if( !charPosMap.containsKey(ch)){
                charPosMap.put(ch,i);
                System.out.println("Testing ::: "+charPosMap.keySet().size());

            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
        }
        System.out.println(charPosMap.size());

        System.out.println(charPosMap.keySet().toString());

        return 0;
    }

    public static void main(String[] args) {
        getLongestSubstring("pwwkew");
    }
}
