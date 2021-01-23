package arrays;

public class PivotIndex {
    public static void main(String[] args) {
        findPivotIndex(new int[]{1,2,3,4,4,2});
    }

    private static void findPivotIndex(int[] ints) {

        int sum = 0, leftSum = 0;
        for (int a : ints) {
            sum += a;
            System.out.println(sum);
        }
    }
}
