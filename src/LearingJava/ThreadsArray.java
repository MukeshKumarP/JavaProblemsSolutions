package LearingJava;

import java.util.Arrays;

public class ThreadsArray implements Runnable{
    int[] array = new int[100];
    @Override
    public void run() {


        int firstSetSerialNumStart = 1000;
        for (int i = 0; i <= 49 ; i++) {
            array[i] = firstSetSerialNumStart;
            firstSetSerialNumStart++;
        }
        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));
    }
}
