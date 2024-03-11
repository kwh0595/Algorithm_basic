package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i < dp.length; i++) {
            if (i % 2 == 0) {
                dp[i] = (dp[i - 1] * 2 + 1) % 10007;
            } else {
                dp[i] = (dp[i - 1] * 2 - 1) % 10007;
            }
        }
        System.out.println(dp[n]);
    }
}
