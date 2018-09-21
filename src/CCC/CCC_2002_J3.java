package CCC;
import java.util.Scanner;


public class CCC_2002_J3 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int p = s.nextInt(), g = s.nextInt(), r = s.nextInt(), o = s.nextInt();
		int a = 0, b = 0,c = 0, d = 0;
		int t =  s.nextInt();
		int tt = t;
		int[] v = new int[3];
	
		for(int x = 0; x <= t ; x++){
			if(x <= p){
				a++;
				t -= x;
			}
		}
		t = tt;
		for(int x = 0; x <= t ; x++){
			
			if(x <= g){
				b++;
				t -= x;
			}
			
		}
		t = tt;
		for(int x = 0; x <= t; x++){
			if(x <= r){
				c++;
				t -= x;
			}
			
		}
		t = tt;
		for(int x = 0; x <= t; x++){
			if(x <= o){
				d++;
				t -= x;
			}
			
		}
		
		t = tt;
		for(int x = 0; x <= a+1; x++){
			for(int x1 = 0; x1 <= b+1; x1++){
				for(int x2 = 0; x2 <= c+1; x2++){
					for(int x3 = 0; x3 <=  d+1; x3++){
						if(x == 0  && x1 == 0 && x2 == 0 && x3 == 0){
							
						}else{
							if(x*p + x1*g + x2*r + x3*o == t ){
								
								System.out.println(x + " pink " + x1 + " green " + x2 + " red " + x3 + " orange");
								
							}
						}
					}
				}
			}
		}
		
		
		
	}

		

}
