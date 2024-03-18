package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int dp[] = new int[n];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[0];
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j] && dp[i] <= dp[j]) {
                    dp[i] += 1;
                }
            }
        }
        int max = dp[0];
        for (int i : dp) {
            max = Math.max(max, i);
        }
        System.out.println(max);

    }
}