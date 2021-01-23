package LearingJava;

public class ArraySum {
    public void simpleArraySum(int[] ints){
        int[] array = new int[ints.length];
        System.out.println(ints.length);
        int value = 0;
        for (int i = 0; i < ints.length; i++) {
            value = value + ints[i];
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        arraySum.simpleArraySum(new int[]{1,2,3});
    }
}
