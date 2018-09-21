import java.util.ArrayList;
import java.util.Scanner;


public class HP_GoldbachsConjecture_09_14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =  s.nextInt();
		Boolean b = true;
		Boolean bn =  false;
		ArrayList<Integer> ia = new ArrayList<>();
		int p1 = 0, p2 = 0;
		int y = 0;
		
		for(int i = 2; i < 1000; i++){
			
			b = true;
			for(int x = 2; x < i; x++){
				if(i%x == 0){
					b = false;
					break;
				}
			}
			if(b){
				ia.add(i);
			}
			
			
		}
		b = true;
		int t = n/2;
		
		for(int i = 2; i < t; i++){
			
			if(t%i == 0){
				b = false;
				break;
			}
			
		}
		if(b){
			
			p1 = t;
			p2 = t;
			
		}else{
			
			for(int i = 0; i < ia.size();i++){
				if(t > ia.get(i) && ia.get(i+1) > t){
					y = i-1;
					
				}
			}
			
			for(int i = y; i >= 0; i--){
				for(int x = y; x < ia.size(); x++){
					
					if(ia.get(i) + ia.get(x) == n){
						p1 = ia.get(i);
						p2 = ia.get(x);
						
						bn = true;
						break;
					}
				}
				if(bn){
				 break;	
				}
			}
			
		}
		
		
		System.out.println(p1 + " + " + p2 + " = " + n);
	}

}
