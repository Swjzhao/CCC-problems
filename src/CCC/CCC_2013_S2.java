package CCC;

import java.util.Scanner;

public class CCC_2013_S2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int n = s.nextInt();
		int a = 0;
		int c = 0;
		int id = 0;
		int[] r = new int[n];
		for(int i = 0; i < n; i++){
			r[i] = s.nextInt();
		}
		for(int i = 0; i < n ; i++){
			
			if(id > 3){
				a -= r[i-4];
				
				a += r[i];
			}else{
				a += r[i];
			}
		
			id++;
			if(a > w){
				c = i;
				break;
			}
			
			
				
		}
		System.out.println(c);

	}

}
