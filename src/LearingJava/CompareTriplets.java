package LearingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public List<Integer> solutionCompareTriplets(List<Integer> arr1, List<Integer> arr2 ){
        List<Integer> newArray = new ArrayList<>();
        int arr1Value = 0;
        int arr2Value = 0;
        for (int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) > arr2.get(i)) {
                ++arr1Value;
            } else if(arr1.get(i)< arr2.get(i)){
                ++arr2Value;
            }
        }
        newArray.add(arr1Value);
        newArray.add(arr2Value);
        System.out.println(arr1Value+" :"+arr2Value);
        return newArray;
    }

    public static void main(String[] args) {

        List<Integer> param1 = new ArrayList<>();
        param1.add(5);
        param1.add(4);
        param1.add(5);



        List<Integer> param2 = new ArrayList<>();
        param2.add(4);
        param2.add(5);
        param2.add(4);

        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<ArrayList<Integer>>();
        twoDArray.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));

        System.out.println(twoDArray.stream().toArray());

        CompareTriplets compareTriplets = new CompareTriplets();
        compareTriplets.solutionCompareTriplets(param1, param2);
    }
}
