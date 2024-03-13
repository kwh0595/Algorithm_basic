package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        long cnt = 0;
        long dp[][] = new long[n + 1][10];
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    sum += dp[i - 1][k] % 10007;
                }
                dp[i][j] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            cnt += dp[n][i];
        }
        System.out.println(cnt % 10007);
    }
}
