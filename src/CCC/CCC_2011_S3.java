package CCC;

import java.util.Scanner;

public class CCC_2011_S3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();

		for(int i = 0; i < t; i++){
			
			int m = s.nextInt(); int x = s.nextInt(); int y = s.nextInt(); 
			boolean b  = find(m,x,y);
			if(b)
				System.out.println("Crystal");
			else
				System.out.println("Empty");
			
		}

	}
	
	public static boolean find(int m, int x, int y){
		
		if(m > 0){
			
			int current = (int) (x / Math.pow(5, m-1));
			System.out.println(current + " " + Math.pow(5, m-1));
			if(current == 0 || current ==4)
				return false;
			else 
				find(m-1, (int)(x%Math.pow(5, m-1)), y);
				return y < x;
			
		}else{
	
			return false;
		}
	}
}
