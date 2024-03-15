package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class dp_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int drink[] = new int[n + 1];
        for (int i = 1; i < drink.length; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }
        int dp[] = new int[n + 1];
        dp[1] = drink[1];
        dp[2] = drink[1] + drink[2];
        for (int i = 3; i < dp.length; i++) {

            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 3] + drink[i - 1], dp[i - 2]) + drink[i]);

        }
        System.out.println(dp[n]);
    }
}
