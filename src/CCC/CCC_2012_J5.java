package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2012_J5 {
	
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		String q = "";
		while(n != 0){
			for(int i = 0; i < n; i++){
				q = s.next();
				arr.add(q);
				arr2.add(q);
			}
			r(arr,arr2,0);
			arr.clear();
			arr2.clear();
			n  = s.nextInt();
		}
		
	}
	
	public static void r(ArrayList<String> arr, ArrayList<String> arr2, int q){
		
		
		
	}

}
