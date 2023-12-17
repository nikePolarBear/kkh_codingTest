package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_1003{
	static int numZ[] = new int [41];
    static int numO[] = new int [41];

	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
        
		numZ[0] = 1; 
		numO[0] = 0;
        
		numZ[1] = 0; 
		numO[1] = 1;
		
		for(int j=2;j<=40;j++) { 
			numZ[j] = numZ[j-2] + numZ[j-1]; 
            numO[j] = numO[j-2] + numO[j-1];                     
		}
		
        
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			
			System.out.println(numZ[n]+" "+numO[n]);
		}

	}
}
