 package DP;

public class LCSTR {
	// NOT FINISHED
	public static void main(String[] args) {
		
		String str1 = "AGGTXAB";

		String str2 = "GXTXAYB";

		int[][] arr = new int[str1.length() + 1][str2.length() + 1];
		
		System.out.println(lcstr(arr,str1,str2));
		
	}
	
	public static int lcstr(int[][] arr, String str1, String str2){
		
		
		int a = str1.length();
		int b = str2.length();

		for (int i = 1; i < a + 1; i++) {
			for (int j = 1; j < b + 1; j++) {
				//System.out.println(str1.substring(0,i) + " " + str2.substring(0,j));
				int m = 1, n= 0;
				if(i == 6 && j == 5)System.out.println(str1.substring(0,i) + " " + str2.substring(0,j));
				for(int x = 1; x < i; x++){
					boolean[] bool = new boolean[x];
					bool[0] = true;
					for(int y = 1; y < j; y++){
						
						if(i == 6 && j == 5){
							System.out.println(str1.charAt(x) + " " + str2.charAt(y) + (str1.charAt(x) == str2.charAt(y)) );
						}
						if(str1.charAt(x) == str2.charAt(y)){
							if(bool[y-1]){
								m++;
								bool[y] = true;
							}else{
								if(m > n){
								n = m;
								m = 1;
								}else{
									m = 1;
								}
							}
						}
					}
					if(m > n){
						n = m;
					
						}
				}
				
				if(n > arr[i-1][j] && n > arr[i][j-1]){
					arr[i][j] = n;
					//System.out.println(0);
				}else{
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}	
		}

//		for (int i = 0; i < a + 1; i++) {
//			for (int j = 0; j < b + 1; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}

		return arr[a][b];
		
	}

}
