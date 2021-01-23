package HackerEarthProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestClass {

    static int solve(int N,int[] A){

        ArrayList<Integer> array = new ArrayList<>();

        int minValue = 0;


        for (int i:A
             ) {
            array.add(i-minValue);
        }
        int max = Integer.MIN_VALUE;
        for (int i:array) {
            if(i > max){
                max = i;
            }
        }
        System.out.println("max ::"+max);
        return max;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<N;i++)
        {
            A[i] = Integer.parseInt(inp[i]);
        }
        int out_ = solve(N, A);
        System.out.println(out_);

        wr.close();
        br.close();
    }
}
