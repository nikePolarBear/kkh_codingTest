package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_1026{
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
        
        int[] a = new int[t];
        int[] b = new int[t];
        
		for(int i=0; i<t; i++) { 
			a[i] =  sc.nextInt();              
		}
        
        for(int i=0; i<t; i++) { 
			b[i] =  sc.nextInt();              
		}
		
		Arrays.sort(a);
        
        Integer[] arr = new Integer[t];
        
		for(int i = 0; i < b.length; i++) {
			arr[i] = b[i];
		}

		Arrays.sort(arr, Collections.reverseOrder());

        int answer = 0;
        
        for(int i=0; i<t; i++) { 
			answer += arr[i] * a[i];            
		}
        
        System.out.println(answer);
	}
}
