package CCC;
import java.util.Scanner;


public class CCC_2003_J1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = 0;
		int n = 0;
		int s = 0;
		int h = 0;
		
		System.out.println("Enter tine length:");
		t = sc.nextInt();
		System.out.println("Enter # of tines:");
		n = sc.nextInt();
		System.out.println("Enter tine spacing:");
		s = sc.nextInt();
		System.out.println("Enter handle length:");
		h = sc.nextInt();
		
		int x = s*(n-1);
		
		
		
		for(int i = 0; i < t; i++){
			for(int ii = 0; ii < n + x; ii++){
			
				
					if(ii % (s+1) == 0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				
				
			}
			System.out.println("");
		}
		for(int i = 0; i < n + x; i++){
			
			System.out.print("*");
			
		}
		System.out.println("");
		
		for(int i = 0; i < h; i++){
			for(int ii = 0; ii < n + x; ii++){
				
				if(ii == (int)((n+x-1)/2)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
			
		
	}

}
