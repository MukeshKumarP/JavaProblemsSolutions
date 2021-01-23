package LearingJava;

public class ArraySumBigValues {
    public void simpleArraySum(long[] longValues){
        long[] array = new long[longValues.length];
        System.out.println(longValues.length);
        long value = 0;
        for (int i = 0; i < longValues.length; i++) {
            value = value + longValues[i];
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        ArraySumBigValues arraySum = new ArraySumBigValues();
        arraySum.simpleArraySum(new long[]{1000000001,1000000002,1000000003});

    }
}
