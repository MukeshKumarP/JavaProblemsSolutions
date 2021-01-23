package LearingJava;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean findNumIsPrime(int num){
        boolean primeOrNot = true;
        for (int i = 2; i < num-1 ; i++) {
            if(num != i ){
                if(num % i == 0) {

                    primeOrNot =false;

                }
            }
        }
        System.out.println(primeOrNot);
        return primeOrNot;
    }

    public static void listOfPrimeNumsTill(int tillNum){
        int count= 0;

        List<Integer> listValues = new ArrayList<>();
        for (int i = 1; i <= tillNum; i++) {
            count = 0;
            for (int j = 2; j < i/2; j++) {
                    if(i % j == 0){
                        count++;
                    }

            }
            if(count == 0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        findNumIsPrime(893);
   //    listOfPrimeNumsTill(50);
    }
}
