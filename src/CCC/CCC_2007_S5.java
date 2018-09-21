package CCC;

import java.util.Scanner;

public class CCC_2007_S5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++){
			
			int n = s.nextInt(); //num of pins
			int k = s.nextInt(); //num of balls
			int w = s.nextInt(); //width
			
			int[] arr = new int[n];
			int[] sum = new int[n];
			int[][] dp = new int[k+1][n];
			
			for(int j = 0; j < n; j++){
				arr[j] = s.nextInt();
			}
			
			for(int j = 0; j < n;j++){
				for(int l = 0; l < w; l++){
					if(j-l>=0){
						sum[j]+=arr[j-l];
					}
				}
			}
			for(int j = 1; j < k +1;j++)
				dp[j][0] = sum[0];
				
			for(int j = 0; j < n; j++)
				System.out.print(sum[j] + " ");
			
			System.out.println();
				
			for(int j = 1; j < k + 1; j++){
				for(int l = 1; l < n;l++){
					if(l-w>=0){
						dp[j][l] = Math.max(dp[j-1][l-w] + sum[l], dp[j][l-1]);
					}else{
						dp[j][l] = sum[l];
					}
				}
			}
			for(int[]a : dp){
				for(int j:a){
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.out.println(dp[k][n-1]);
			
		}
		
	}

}
