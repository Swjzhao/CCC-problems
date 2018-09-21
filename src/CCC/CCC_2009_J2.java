package CCC;
import java.util.Scanner;


public class CCC_2009_J2 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int bt = s.nextInt(), np = s.nextInt(), yp = s.nextInt();
		int a = 0, b = 0,c = 0;
		int t =  s.nextInt();
		int tt = t;
		int[] v = new int[3];
	
		for(int x = 0; x <= t; x++){
			if(x <= bt){
				a++;
				t -= x;
			}
		}
		t = tt;
		for(int x = 0; x <= t; x++){
			
			if(x <= np){
				b++;
				t -= x;
			}
			
		}
		t = tt;
		for(int x = 0; x <= t; x++){
			if(x <= yp){
				c++;
				t -= x;
			}
			
		}
		t = tt;
		for(int x = 0; x <= a; x++){
			for(int x1 = 0; x1 <= b; x1++){
				for(int x2 = 0; x2 <= c; x2++){
					if(x == 0  && x1 == 0 && x2 == 0){
						
					}else{
						if(x*bt + x1*np + x2*yp <= t ){
							
							System.out.println(x + " Brown Trout " + x1 + " Northern Pike " + x2 + " Yellow Trout");
							
						}
					}
				}
			}
		}
		
		
		
	}
	
}
