package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[11];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int j = 3; j < dp.length; j++) {
            dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
        }
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(br.readLine());
            System.out.println(dp[size]);
        }
    }
}
