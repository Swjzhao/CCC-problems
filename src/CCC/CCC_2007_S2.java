package CCC;

import java.util.Scanner;

public class CCC_2007_S2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] l = new int[n];
		int[] w = new int[n];
		int[] h = new int[n];
		
		
		for(int i = 0; i < n ; i++){
			l[i] = s.nextInt();
			w[i] = s.nextInt();
			h[i] = s.nextInt();
		}
		int m = s.nextInt();
		
		int[] il = new int[m];
		int[] iw = new int[m];
		int[] ih = new int[m];
		
		for(int i = 0; i < m;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int t = - 1;
			int ct = Integer.MAX_VALUE;
			for(int j = n - 1;j>= 0; j--){
				
				if(a <= l[j] && b<=w[j] && c <= h[j] || b <= l[j] && c<=w[j] && a <= h[j] || 
						c <= l[j] && b<=w[j] && a <= h[j] || a <= l[j] && c<=w[j] && b <= h[j] ||
						b <= l[j] && a<=w[j] && c <= h[j] || c <= l[j] && a<=w[j] && b <= h[j] ){
					t = j;
					if(t < ct){
						
						ct = t;
					}else{
						
					}
					
					
				}
			}
			if(ct == Integer.MAX_VALUE){
				System.out.println("Item does not fit");
			}else{
				System.out.println(l[ct]*w[ct]*h[ct]);
			}
		}

	}
	
	

}
