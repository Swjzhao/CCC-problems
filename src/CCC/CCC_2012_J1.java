package CCC;

import java.util.Scanner;

public class CCC_2012_J1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int sp = s.nextInt();
		
		if(l >= sp){
			System.out.println("Congratulation, you are within the speed limit");
		}else if(sp-l <= 20){
			System.out.println("You are speeding and your fine is $100");
			
		}else if(sp-l <= 30){
			System.out.println("You are speeding and your fine is $270");
		}else{
			System.out.println("You are speeding and your fine is $500");
		}
	}

}
