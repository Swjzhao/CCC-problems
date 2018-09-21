package CCC;
import java.util.Scanner;


public class CCC_2003_J3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = 1;
		int n;
		
		
		while(a != 100){
			
			System.out.println("Enter sum of dice");
			n = s.nextInt();
			if(n == 0){
				System.out.println("You Quit");
				break;
			}
			a += n;
			if(a > 100){
				a = a-n;
			}
			if(a == 54){
				a = 19;
			}else if(a == 90){
				a = 48;
			}else if(a == 99){
				a = 77;
			}
			if(a == 9){
				a = 34;
			}else if(a == 40){
				a = 64;
			}else if(a == 67){
				a = 86;
			}
			
			System.out.println("You are now on square " + a);
			
		}
		System.out.println("You Win");

	}

}
