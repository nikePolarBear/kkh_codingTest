package kkh;
import java.util.*;
import java.math.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_11399{
	static int dp[] = new int [11];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		dp[1] =1; 
		dp[2]=2;
		dp[3]=4;
		
		for(int j=4;j<=10;j++) {
			dp[j] = dp[j-3] + dp[j-2] + dp[j-1]; 
		}
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			
			System.out.println(dp[n]);
		}
	}
}

