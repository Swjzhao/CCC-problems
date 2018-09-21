package NotFinished;

import java.util.Scanner;

public class CCC_2008_J5 {
	
	public static String winner = "";
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0, b = 0, c = 0, d = 0;
		
		int[] cases = new int[4];
		int[][] arr = new int[5][4];
		int[][] arr1 = new int[5][4];
		String[] react = new String[5];
	
		arr[0][0] = 2;
		arr[0][1] = 1;
		arr[0][3] = 4;
		arr[1][0] = 1;
		arr[1][1] = 1;
		arr[1][2] = 1;
		arr[1][3] = 1;
		arr[2][2] = 2;
		arr[2][3] = 1;
		arr[3][1] = 3;
		arr[4][0] = 1;
		arr[4][3] = 1;
		
		arr1[0][0] = 2;
		arr1[0][1] = 1;
		arr1[0][3] = 4;
		arr1[1][0] = 1;
		arr1[1][1] = 1;
		arr1[1][2] = 1;
		arr1[1][3] = 1;
		arr1[2][2] = 2;
		arr1[2][3] = 1;
		arr1[3][1] = 3;
		arr1[4][0] = 1;
		arr1[4][3] = 1;
		
		
		
		for(int i = 0; i < n; i++){
			winner = "";
			for(int j = 0; j < 4; j++){
				cases[j] = s.nextInt();
				
			}
			r(0,cases,arr,Integer.MAX_VALUE);
			System.out.println(winner);
			for(int x = 0; x < 5;x++){
				for(int y = 0; y < 4; y++){
					arr[x][y] = arr1[x][y];
				}
			}
		
		}
		
		

	}
	
	public static void r(int turn, int[] cases, int[][] arr, int lim){
		
		for(int i = 0; i <  5; i++){
			
			if(arr[i][0] <= cases[0] && arr[i][1] <= cases[1] && 
					arr[i][2] <= cases[2] && arr[i][3] <= cases[3]){
				cases[0] -= arr[i][0];
				cases[1] -= arr[i][1];
				cases[2] -= arr[i][2];
				cases[3] -= arr[i][3];
				r(turn+1,cases,arr,0);
				return;
			}
			 
		}
		//System.out.println(turn);
	
		if(turn%2 == 0){
			winner = "Roland";
		}else{
			winner = "Patrick";
		}
		
		return;
		
	}

}
