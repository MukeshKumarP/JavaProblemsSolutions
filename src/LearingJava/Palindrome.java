package LearingJava;

public class Palindrome {
    public static void checkingPalindrome(String value){
        String afterReverse = "";

        for (int i = value.length()-1; i >= 0; i--) {
            afterReverse+=value.charAt(i);
        }
        if(value.equals(afterReverse))
            System.out.println("Given value is a Palindrome");
            System.out.println("Given value is not a Palindrome");

    }
    public static void main(String[] args) {
        checkingPalindrome("1234");
    }
}
