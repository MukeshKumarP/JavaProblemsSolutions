package StringManipulation;

public class ImplementSubStr {

    public static int strStr(String haystack, String needle){

        if(haystack != null & needle != null){
            return haystack.indexOf(needle);
        }else if(needle == null){
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        strStr("Hello","12");
    }
}
