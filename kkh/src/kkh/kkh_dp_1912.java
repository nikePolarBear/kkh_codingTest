package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_dp_1912{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
        
        int arr[] = new int[num];
		
		int answer[] = new int[num];
               
        for (int b = 0; b < num; b++) {
			 arr[b] = sc.nextInt();
		}

         answer[0] = arr[0];
        
		for(int b = 0; b < num-1; b++) {
			if(answer[b]+arr[b+1]> arr[b+1]) {
				answer[b+1] = answer[b]+arr[b+1];
			} else {
				answer[b+1] = arr[b+1];
			}
		}
		
		int max = Integer.MIN_VALUE;;
		
		for(int b = 0; b < num; b++) {
			if(answer[b] > max)
				max = answer[b];
		}
		
		System.out.print(max);
	}
}
