package kkh;
import java.util.*;

public class kkh_gr_16953{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int count = 0;

		while(b != a) {
			if(b/2==a) {
				count++;
				break;
			} else if(b/2 ==1 ) {
				count = -2;
				break;
			}else if(b/2 != a){
				if(b%2==0) {
					b = b/2;
					count++;
				} else if(b%2==1) {
					b = (b-1)/10;
					count++;
				}
			} 
		}
		System.out.print(count+1);
	}
}
