package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_dp_1932{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 int num = sc.nextInt();

		int tree[][] = new int[num][num];
        
		for (int a = 0; a < num; a++) {
			for (int b = 0; b <= a; b++) {
			 tree[a][b] = sc.nextInt();
			}
		}

		for (int a = 1; a < num; a++) {
			tree[a][0] += tree[a - 1][0];

			if (a == 1) {
				tree[a][a] += tree[a - 1][0];
			} else {
				tree[a][a] += tree[a - 1][a - 1];
			}
		}

		for (int a = 2; a < num; a++) {
			for (int b = 1; b < a; b++) {
				if (Integer.compare(tree[a - 1][b - 1], tree[a - 1][b]) == -1) {
					tree[a][b] += tree[a - 1][b];
				} else {
					tree[a][b] += tree[a - 1][b - 1];
				}
			}
		}

		int max = 0;

		for (int i = 0; i < num; i++) {
			if (tree[num - 1][i] > max) {
				max = tree[num - 1][i];
			}
		}

		System.out.println(max);
	}
}
