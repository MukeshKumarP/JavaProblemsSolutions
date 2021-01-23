package StringManipulation;

import java.util.LinkedHashMap;

/**
 * thisIsOneVariable -> this_is_one_variable
 * this_is_one_variable -> thisIsOneVariable
 */
public class VariableNameFormatChange {


    static void underscoreToCaps(){
        String str = "this_is_one_variable";

        char[] ch = str.toCharArray();

        for (int i = str.indexOf("_"); i < str.length(); i++) {
            if (i == str.indexOf("_") && ch[i] != '_' ||
                    ch[i] != '_' && ch[i - 1] == '_') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 'a' + 'A');
                }
            }
        }
        String st = new String(ch);
        System.out.println(st.replace("_", ""));
    }

    static void capsToUnderscore(){
        String strCapsToUnderscore = "thisIsOneVariable";
        StringBuilder  temp = new StringBuilder();
        char[] chCap = strCapsToUnderscore.toCharArray();
        for (int i = 0; i < strCapsToUnderscore.length(); i++) {
            if(chCap[i] >'A' && chCap[i] <= 'Z'){
                chCap[i] = (char) (chCap[i]-'A'+ 'a');
                temp.append("_");
                temp.append(chCap[i]);
            }else{
                temp.append(chCap[i]);
            }
        }

        System.out.println(temp);
    }

    public static void main(String[] args) {
        capsToUnderscore();
    }

}
