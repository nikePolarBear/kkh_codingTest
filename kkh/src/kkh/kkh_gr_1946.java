package kkh;

import java.util.*;

public class kkh_gr_1946 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();
			
			int count = 1;
			
			int work[] = new int[m + 1];
			
			for (int j = 0; j < m; j++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				work[a] = b;
			}

			int vot = work[1];

			for (int j = 2; j <= m; j++) {
				if (work[j] < vot) {
					vot = work[j];
					count++;

				}
			}
			System.out.println(count);

		}
	}
}
