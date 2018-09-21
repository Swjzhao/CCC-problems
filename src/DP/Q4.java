package DP;

public class Q4 {

	public static void main(String[] args) {
		
		char[] str1 = "ABC".toCharArray();
		char[] str2 = "BCD".toCharArray();
		System.out.println(shortestCommonSuperSequence(str1,str2));

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
