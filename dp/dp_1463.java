package Algorithm_basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n];
        int cnt = 0;
        dp[0] = n;
        for (int i = 1; i < n; i++) {
            if (dp[i] == 1) {
                System.out.println(cnt);
                break;
            }
            if (n % 3 == 0) {
                cnt++;
                dp[i] = n / 3;
            }
            if (n % 2 == 0) {
                cnt++;
                dp[i] = n / 2;
            }
            cnt++;
            dp[i] = n - 1;
        }
    }
}
