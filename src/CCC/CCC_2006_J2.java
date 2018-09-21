package CCC;
import java.util.Scanner;


public class CCC_2006_J2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int t = 0;
		
		for(int x = 1; x <= m; x++){
			for(int y = 1; y <= n; y++){
				
				if(x + y == 10){
					t++;

				}
				
			}
		}
		System.out.println("There are " + t + " way(s) to get to 10");
		
	}

}
