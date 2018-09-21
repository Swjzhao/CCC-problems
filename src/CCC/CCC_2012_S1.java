package CCC;

import java.util.Scanner;

public class CCC_2012_S1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = 0;
		for(int i = 1; i < n; i++){
			for(int j = i+1; j < n; j++){
				for(int k = j+1; k < n;k++){
					
						//System.out.println(i + " " + j + " " + k);
						
						t++;
					
					
				}
			}
		}
		System.out.println(t);
	}
	

	

}
