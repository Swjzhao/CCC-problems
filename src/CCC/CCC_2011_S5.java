package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2011_S5 {
	//18 1 1 0 1 1 1 0 0 1 1 0 0 1 0 1 0 1 1
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int k = s.nextInt();
		boolean[] bool = new boolean[k];
		String str = s.nextLine();
		str.replace(" ", "");
		int[] lights = new int[k];
		for(int i = 0 ; i < k; i++){
			lights[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		for(int i = 0 ; i < k; i++){
			
		}
		

	}

}
