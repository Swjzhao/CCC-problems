package DP;

public class KnapSack {

	public static void main(String[] args) {
		 int val[] = {10, 40, 30, 50};
		 int wt[] = {5,4, 6,3};
		 int w = 10;
		 
		 System.out.println(KS(val,wt,w));

	}
	public static int KS(int[] val, int[] wt, int w){
		int n = val.length;
		int[][] arr = new int[n+1][w+1];
		for(int i = 0; i < w; i++){
			arr[0][i] = 0;
		}
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j <= w; j++){
				if(wt[i-1] <= j){
				arr[i][j] = Math.max(arr[i-1][j], val[i-1] + arr[i-1][ j-wt[i-1]] );
				}else{
					arr[i][j] = arr[i-1][j];
				}
			}
		}
		
		for(int i = 0; i <= n;i++){
			for(int j = 0; j <= w; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		return arr[n][w];
	}

}
