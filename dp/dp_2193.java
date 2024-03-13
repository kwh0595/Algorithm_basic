package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        int dp[][] = new int[n + 1][2];
        dp[1][0] = 0;
        dp[1][1] = 1;
        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j + 1];
                } else {
                    dp[i][j] = dp[i - 1][0];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            sum += dp[n][i];
        }
        System.out.println(sum);

    }
}
