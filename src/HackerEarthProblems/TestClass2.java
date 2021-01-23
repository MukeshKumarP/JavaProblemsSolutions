package HackerEarthProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr_arr = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
                arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }

            int out_ = solve(arr, n);
            wr.println(out_);
        }

        wr.close();
        br.close();
    }

    static int solve(int[] arr, int n) {

        int value = 0;

        for (int v:arr
             ) {
            for (int j = 0; j < n; j++) {
                value += arr[j] / v;
                System.out.println(value);
            }
        }

        return  value;
    }
}