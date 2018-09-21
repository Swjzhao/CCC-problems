package CCC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CCC_2011_J5 {
	static int counter = 1;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] num = new int[n];
		Arrays.fill(num, 1);
		
		for(int i = 0; i < n-1; i++){
			int t = s.nextInt();
			num[t-1] *= num[i] + 1;
		}
		
		
	
		System.out.println(num[num.length-1]);
		
	
	}
	
	
	

}
