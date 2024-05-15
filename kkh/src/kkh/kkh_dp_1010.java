package kkh;

import java.util.*;

public class kkh_dp_1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] dp = new int[30][30];
		
		for (int i = 0; i < 30; i++) {
			dp[i][i] = 1;
			dp[i][0] = 1;
		}

		for (int i = 2; i < 30; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}

		int T = sc.nextInt();

		int[] num = new int[T];

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			num[i] = dp[M][N];
		}

		for (int i = 0; i < T; i++) {
			System.out.println(num[i]);
		}
	}
}
