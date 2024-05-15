package kkh;

import java.util.*;

public class kkh_dp_2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		long dp[] = new long[num + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < num + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[num]);
	}
}
