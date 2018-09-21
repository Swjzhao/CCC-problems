package CCC;
import java.util.Scanner;


public class CCC_2000_J3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many quarters does Martha have in the jar?");
		int tt = sc.nextInt();
		System.out.println("How many times has the first machine been played since paying out?");
		int f =  sc.nextInt();
		System.out.println("How many times has the second machine been played since paying out?");
		int s =  sc.nextInt();
		System.out.println("How many times has the third machine been played since paying out?");
		int t = sc.nextInt();
		
		int a = f, b = s, c= t;
		int x = 0;
		int y = 0;
		while(tt > 0){
			
			switch(y){
				
			case 0: tt--;
					a++;
					if(a== 35){
						tt += 30;
						a = 0;
						f = 0;
					}
					y++;
					break;
			case 1:tt--;
					b++;
					if(b== 100){
						tt += 60;
						b = 0;
						s = 0;
					}
					y++;
					break;
			case 2: tt--;
					c++;
					if(c == 10){
						tt += 9;
						c = 0;
						t = 0;
					}
					y = 0;
					break;
			
			}
			x++;
			
		}
		System.out.println("Martha plays " + x + " times before going broke");
	}

}
