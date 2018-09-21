package DP;

import java.io.IOException;

public class LCS {

	public static String ss = "";
	public static void main(String[] args) throws IOException {

		String str1 = "AGGTAB";

		String str2 = "GXTXAYB";

		int[][] arr = new int[str1.length() + 1][str2.length() + 1];

		int length = build(arr, str1, str2);

		lcs(arr, str1, str2, str1.length(),str2.length(),"");
		char[] c = ss.toCharArray();
		ss = "";
		for(int i = 0; i < c.length; i++){
			ss += c[c.length-1-i];
		}
		System.out.println(ss);
	}

	public static int build(int[][] arr, String str1, String str2) {

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

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		return arr[n][m];

	}

	public static void lcs(int[][] arr, String str1, String str2, int i, int j, String result) {

		if(i == 1 && j == 1){
			ss = result;
			//System.out.println(result);
			return;
		}else{
				if (i > 1 || j > 1) {
					
					if (arr[i - 1][j] < arr[i][j] && arr[i - 1][j] == arr[i][j-1] ) {
						//System.out.println(str1.charAt(i-1));
						
						result += str1.charAt(i-1);
						//System.out.println(result+ ": " + i + ": " + j + " " + str1.charAt(i-1));
						ss = result;
						i--;
						j--;
						lcs(arr,str1,str2,i,j,result);
					}
				}
				
					if (i > 1 &&arr[i - 1][j] == arr[i][j]) {
					
						i--;
						lcs(arr,str1,str2,i,j,result);
	 
					} else if(j > 1&& arr[i][j - 1] == arr[i][j]){
						
						j--;
						lcs(arr,str1,str2,i,j,result);
					}
				
		
		}
		
		
		return;

	}

}
