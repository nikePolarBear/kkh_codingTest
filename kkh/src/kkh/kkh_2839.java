package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_2839{
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String scNum = sc.next();
		
		int num = Integer.parseInt(scNum);
		
		int count = 0;
		
		if(num < 5) {
			return 1;
		} else {
			count = num/5;
		}
		
		if(num < 3) {
			return count+1;
		} else {
			if((num%5)/3 < 3) {
				return count+(num%5)/3+1;
			} else {
				return count+(num%5)/3;
			}
		}
	}
}
