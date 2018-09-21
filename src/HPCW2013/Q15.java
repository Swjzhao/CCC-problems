package HPCW2013;

import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][3];
		for(int i = 0; i < n; i++ ){
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
			arr[i][2] = s.nextInt();
					
		}
		int max = 200;
		ArrayList<String> arr1 = new ArrayList<>();
		int index = 0;
		int lastl = 120;
		int lastw = 120;
		for(int i = 0; i < n; i++){
			if(arr1.get(index) == null){
				arr1.add("");
			}
			int min = Math.min((Math.min(arr[i][0],arr[i][1] )), arr[i][2]);
		
				
		
				
			arr1.add((char)('A' + i) + " ");
		}

	}

}
