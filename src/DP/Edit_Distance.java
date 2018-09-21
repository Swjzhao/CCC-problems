package DP;

public class Edit_Distance {

	public static void main(String[] args) {
		
//		String str1 = "cookies";
//		String str2 = "teemo";
		String str1 = "algorithm";
		String str2 = "altruistic";
		int[][] arr = new int[str1.length()+1][str2.length()+1];
		System.out.println(ed(arr,str1,str2));
	}
	
	public static int ed(int[][]arr, String str1, String str2){
		
		int a  = str1.length();
		int b = str2.length();
		
		for(int i = 1 ; i < b + 1; i++){
			arr[0][i] = 0;
		}
		
		for(int i = 1; i < a+ 1; i++){
			arr[i][0] = i;
			for(int j = 1; j < b+1; j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					arr[i][j] = Math.min(Math.min(arr[i-1][j] + 1, arr[i][j-1] + 1), arr[i-1][j-1]);
				}else{
					arr[i][j] = Math.min(Math.min(arr[i-1][j] + 1, arr[i][j-1] + 1), arr[i-1][j-1] + 1);
					
				}
				
			}
		}
		
		return arr[a][b];
	}

}
