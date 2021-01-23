package LearingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    List<List<Integer>> intArray = new ArrayList<>();

    public List<List<Integer>> calDiagonalDifference(){


        return intArray;
    }

    public static void main(String[] args) {

       int[][] twoDArray = {{1,0,0,2,3,2},{1,1,0,1,1,0},{1,0,1,1,1,1},{1,1,1,0,0,0},{0,0,1,1,1,0},{0,1,0,1,0,1}};
        System.out.println(twoDArray.length);

        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray.length ; j++) {
                System.out.print(twoDArray[i][j]+" ");
                if(i==j){
                    resultArray.add(twoDArray[i][j]);
                }
            }
            System.out.println();


        }
    }
}
