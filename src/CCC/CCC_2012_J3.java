package CCC;
import java.util.Scanner;


public class CCC_2012_J3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < 3*n; i++){
			for(int j = 0; j < 3*n; j++){
				if(i < n){
					if(j < n){
						System.out.print("*");
					}else if(j < 2*n){
						System.out.print("X");
					}else{
						System.out.print("*");
					}
				}else if(i < 2*n){
					if(j < n){
						System.out.print(" ");
					}else if(j < 2*n){
						System.out.print("X");
					}else{
						System.out.print("X");
					}
				}else{
					if(j < n){
						System.out.print("*");
					}else if(j < 2*n){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		

	}

}
