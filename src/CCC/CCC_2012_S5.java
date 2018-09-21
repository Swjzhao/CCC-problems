package CCC;

import java.util.Arrays;
import java.util.Scanner;

public class CCC_2012_S5 {

	static int counter = 0;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	
		int x = s.nextInt();
		int y = s.nextInt();

		int k = s.nextInt();
		
		boolean[][] map = new boolean[x+1][y+1];
		int[][] arr = new int[x+1][y+1];
		
		
		
		
		for(int i = 0; i <k ; i++)
			map[s.nextInt()][s.nextInt()] = true;
		
		arr[0][0] = 1;
		arr[1][1] = 1;
		
		for(int i = 1; i < x + 1; i++){
			for(int j = 1; j < y + 1; j++){
				if(!map[i][j])
					if(!map[i-1][j] || !map[i][j-1])
						arr[i][j] += arr[i-1][j] + arr[i][j-1];
					
						//arr[i][j] = arr[i-1][j-1];
				
			}
		}
		for(boolean[] arr1: map){
			for(boolean b : arr1){
				if(b){
					System.out.print(0 + " ");
				}else{
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int[] arr1 :arr) {
			for (int i : arr1) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println(arr[x][y]);
		
	}


	
}
