package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_2775{
static int room[][] = new int [15][15];
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
        
		for(int i=1;i<=14;i++) { 
			room[0][i] = i;                  
		}
		
		for(int a=1;a<=14;a++) { 
            int tot = 0;
            for(int b=1;b<=14;b++){
                if((b-1)==0) {
                    room[a][b] = room[a-1][b];
                } else {
                    room[a][b] =room[a][b-1]+room[a-1][b];
                }
            }             
		}
		
        
		for(int i=0; i<t; i++) {
			int f = sc.nextInt();
            int h = sc.nextInt();
			
			System.out.println(room[f][h]);
		}

	}
}
