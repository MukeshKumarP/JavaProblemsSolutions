package StringManipulation;

import java.util.LinkedHashMap;

public class SameStringCount {

    static void getStringAndCount(String str){
        char[] ch = str.toCharArray();
        int count = 0 ;

        LinkedHashMap<Character,Integer> temp = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if(i+1 <str.length()){
                if(!temp.containsKey(ch[i])){
                    temp.put(ch[i],++count);

                }
            }
            count = 0;
        }
    }

    public static void main(String[] args) {
        getStringAndCount("aaabbccdee");
    }
}
