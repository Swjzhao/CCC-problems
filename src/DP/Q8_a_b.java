package DP;

public class Q8_a_b {

	public static void main(String[] args) {

		int[][] arr = { { 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 1, 1, 0, 0, 0, 0 },
						{ 0, 1, 1, 0, 1, 0, 0 },
						{ 0, 0, 0, 1, 1, 0, 0 },
						{ 0, 0, 1, 1, 1, 1, 0 },
						{ 0, 0, 1, 1, 1, 1, 0 },
						{ 0, 0, 0, 1, 1, 1, 0 } };

		int[][] arr1 = { { 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 1, 1, 0, 1, 1, 1 },
						 { 0, 1, 1, 0, 1, 1, 1 },
						 { 0, 1, 1, 0, 0, 0, 0 },
						 { 0, 0, 0, 1, 1, 1, 1 },
						 { 0, 0, 0, 1, 1, 1, 1 },
						 { 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 1, 1, 1, 0, 0, 0 },
						 { 0, 1, 1, 1, 0, 0, 0 },
						 { 0, 1, 1, 1, 0, 0, 0 }};
		int[][] arr2 = {{0,1}};
		System.out.println(sqrA(arr)); // a
		//System.out.println(sqrC(arr1)); //b
	}

	public static int sqrA(int[][] arr) {

		int x = arr.length;
		int y = arr[0].length;
		int[][] arr1 = new int[x][y];
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				if (arr[i][j] == 1) {
					arr1[i][j] = Integer.min(arr1[i-1][j-1],Integer.min(arr1[i - 1][j], arr1[i][j - 1])) + 1;

				} else {
					arr1[i][j] = arr[i][j];
				}
			}
		}
		int max = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr1[i][j] + " ");
				if (arr1[i][j] > max)
					max = arr1[i][j];
			}
			System.out.println();
		}
		return max * max;
	}

	public static int sqrC(int[][] arr) {

		int x = arr.length;
		int y = arr[0].length;
		int[][] arr1 = new int[x][y];
		int[][] arr2 = new int[x][y];
		
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				
				
				
				
				
				
				if(arr[i][j] == 1 && arr[i-1][j] == 0){
					arr1[i][j] = arr1[i][j-1]+1;
				}else if(arr[i][j] == 1 && arr[i][j-1] == 0){
					arr1[i][j] = arr1[i-1][j]+1;
				}else if (arr[i][j] == 1) {
					arr1[i][j] = 0;
				} else {
					
					arr1[i][j] = arr[i][j];
				}
			}

		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr1[i][j] + " ");

			}
			System.out.println();
		}
		return 0;

	}
}
