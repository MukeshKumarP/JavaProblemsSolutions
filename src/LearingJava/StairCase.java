package LearingJava;

import java.util.ArrayList;
import java.util.Arrays;

public class StairCase {

    public static void buildStairCase(int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i+j >=size-1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        buildStairCase(6);
    }
}
