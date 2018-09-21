package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2014_S5{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++){
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}
		boolean b = true;
		int cx = 0, cy = 0;
		int ccx = 0, ccy = 0;
		double d;
		double d1 = 0;
		double maxd = Integer.MAX_VALUE;
		int counter = 0;
		while(b){
			d = (double)0;
			d1 = (double)0;
			for(int i = 0; i < n;i++){
				
				d = Math.sqrt((cx - x[i])*(cx-x[i]) + (cy - y[i])*(cy - y[i]));
				if(d > d1 && d < maxd){
					d1 = d;
					ccx = x[i];
					ccy = y[i];
				}
			}
			maxd = d1;
			counter++;
			cx = ccx;
			cy = ccy;
		
			if(d1 == (double)0){
				break;
			}
			
		}
		System.out.println(counter);
		
	}

}
