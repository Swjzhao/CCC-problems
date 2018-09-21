package CCC;
import java.util.Scanner;


public class CCC_2011_J2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a ,h, m, t;
		h = s.nextInt();
		m = s.nextInt();
		Boolean b = false;
		
		for(t = 1; t <= m; t++){
			
			a = -6*(t*t*t*t) + h*(t*t*t) + 2*(t*t) + t;
			if(a <= 0){
				
				System.out.println("The balloon first touches ground at hour: " + t);
				b = true;
				break;
			}
		}
		if(!b){
			System.out.println("The balloon does not touch ground in the given time.");
		}

	}

}
