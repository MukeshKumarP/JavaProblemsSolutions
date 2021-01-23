package LearingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference_2 {

    public static int findDaigonalDifference(ArrayList<ArrayList<Integer>> arr){
        int leftDiagonalValue = 0;
        int rightDiagonalValue = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(i==j){
                    leftDiagonalValue = leftDiagonalValue+ arr.get(i).get(j);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if ((i + j) == (arr.size() - 1)){
                    rightDiagonalValue = rightDiagonalValue+ arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftDiagonalValue-rightDiagonalValue);
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<ArrayList<Integer>>();
        twoDArray.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
        twoDArray.add(new ArrayList<Integer>(Arrays.asList(1, 2, 2)));
        twoDArray.add(new ArrayList<Integer>(Arrays.asList(3, 2, 1)));

        findDaigonalDifference(twoDArray);
    }
}
