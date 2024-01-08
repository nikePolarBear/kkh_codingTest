package kkh;
import java.util.*;
/*
 * 매 선택 시에 가장 좋은 것(구하고자 하는 값)만 선택하고 다른 요소는 무시하는 스따일이라고 이해하자.
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class kkh_dp_9095{
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전체 인원");
		String pNum = sc.next();
		
		System.out.println("인원 별 인출 시간");
		String pTime = sc.next();
		
		int num = Integer.parseInt(pNum);
		
		String[] time = pTime.split(" ");
		
		int[] timeToTime = null;
		
		for(int i=0; i< time.length; i++) {
			timeToTime[i] = Integer.parseInt(time[i]);
		}
		
		System.out.print(timeToTime);
		
		Arrays.sort(timeToTime);
		
		int answer = 0;
		
		for(int i=1; i< time.length; i++) {
			for(int a = 0; a <timeToTime[i]; a++) {
				answer = answer + timeToTime[a];
			}
		}
		
		
		return answer+timeToTime[0];
	}
}
