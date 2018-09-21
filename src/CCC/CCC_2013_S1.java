package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2013_S1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		int a = 0;
		boolean b = false;
		
		for(int i = in+1; i < i+1; i++){
			String str = i+"";
			b = false;
			int[] iarr = new int[10];
			for(int j = 0; j < str.length(); j++){
				iarr[Integer.parseInt(str.substring(j,j+1))]++;
			}
		
			for(int j = 0; j<10;j++){
				if(iarr[j] > 1){
					
				b = true;	
				}
			}
			if(!b){
				a = i;
				break;
			}
		}
		System.out.println(a);
		
	
		
	}

}
