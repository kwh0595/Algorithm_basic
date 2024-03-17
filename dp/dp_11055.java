package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class dp_11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int dp[] = new int[n];
        dp[0] = array[0];
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    max = Math.max(max, array[j]);
                }
            }
            dp[i] = dp[max] + array[i];
        }

        int max2 = dp[0];
        for (int i : dp) {
            max2 = Math.max(max, i);
        }
        System.out.println(max2);
    }
}
