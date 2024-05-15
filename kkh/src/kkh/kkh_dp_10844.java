package kkh;

import java.util.*;

/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_dp_10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 int num = sc.nextInt();
        
		long mod = 1000000000;

		long arr[][] = new long[num + 1][10];

		for (int i = 1; i < 10; i++) {
			arr[1][i] = 1;
		}

		for (int i = 2; i <= num; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9) {
					arr[i][9] = arr[i - 1][8]% mod;
				} else if (j == 0) {
					arr[i][0] = arr[i - 1][1]% mod;
				} else {
					arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1])% mod;
				}
			}
		}

		long answer = 0;

		for (int i = 0; i < 10; i++) {
			answer += arr[num][i];
		}

		System.out.print(answer % mod);

	}
}
