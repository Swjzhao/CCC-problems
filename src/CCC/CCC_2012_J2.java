package CCC;

import java.util.Scanner;

public class CCC_2012_J2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		int a3 = s.nextInt();
		int a4 = s.nextInt();
		
		if(a1 == a2 &&  a2 == a3 && a3 == a4 ){
			System.out.println("Constant Depth");
		}else if(a1 > a2 &&  a2 > a3 && a3 > a4){
			System.out.println("Fish Diving");
		}else if(a1 < a2 &&  a2 < a3 && a3 < a4){
			System.out.println("Fish Rising");
		}else{
			System.out.println("No Fish");
		}
	}

}
