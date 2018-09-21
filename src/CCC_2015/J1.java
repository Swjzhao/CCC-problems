package CCC_2015;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		int n = s.nextInt();
		
		if(m < 2){
			System.out.println("Before");
		}else if(m>2){
			System.out.println("After");
		}else{
			if(n == 18){
				System.out.println("Special");
			}else if(n < 18){
				System.out.println("Before");
			}else{
				System.out.println("After");
			}
		}
		

	}

}
