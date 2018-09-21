package CCC;
import java.util.Scanner;


public class CCC_2010_J1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int w = 0;
		int n = s.nextInt();
		
		for(int i = 1; i <= 10; i ++){
			for(int x = 10; x > 0; x--){
				
				if(i + x == n){
					w++;
					
				}
				
			}
			
			
		}
		System.out.println(w);

	}

}
