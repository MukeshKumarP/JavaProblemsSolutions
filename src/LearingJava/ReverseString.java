package LearingJava;

public class ReverseString {
    public static void main(String[] args) {
        String temp = "abcd";
        String newTemp = "";
        for (int i = temp.length()-1; i  >= 0 ; i--) {
            newTemp+=temp.charAt(i);
        }
        System.out.println(newTemp);
    }
}
