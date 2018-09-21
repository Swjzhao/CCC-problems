package DP;

class Q2_a_b {

	public static void main(String[] args) {
		String str1 = "AGGTAB";

		String str2 = "GXTXAYB";

		int[][] arr = new int[str1.length() + 1][str2.length() + 1];
		System.out.println(shortestCommonSuperSequence(str1.toCharArray(), str2.toCharArray()));
		// int t = lcsub(arr,str1,str2);
		// System.out.println(lcsup(str1,str2,t));
	}
	
	public static int lcsub(int[][]arr, String str1, String str2){
		int n = str1.length();
		int m = str2.length();

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {

				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					arr[i][j] = 1 + arr[i - 1][j - 1];
				} else {
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
				}

			}
		}

//		for (int i = 0; i < n + 1; i++) {
//			for (int j = 0; j < m + 1; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}

		return arr[n][m];
	}
	
	public static int lcsup(String str1, String str2, int a){
		return str1.length() + str2.length() - a;
	}
	public static int shortestCommonSuperSequence(char str1[], char str2[]) {
		int matrix[][] = new int[str1.length + 1][str2.length + 1];
		for (int i = 1; i < matrix.length; i++)
		{
			matrix[i][0] = i;
		}
		for (int j = 1; j < matrix[0].length; j++)
		{
			matrix[0][j] = j;
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				matrix[i][j] = Math.min(matrix[i][j - 1], matrix[i - 1][j]) + 1;
				int temp = matrix[i-1][j - 1]+2;
				
				if (str1[i - 1] == str2[j - 1]) {
					temp--;
				}
				matrix[i][j] = Math.min(matrix[i][j], temp);
				

			}
		}
		
		for(int i = 0; i < str1.length+1; i++){
			for(int j = 0; j < str2.length+1; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		return matrix[str1.length][str2.length];
	}

}
