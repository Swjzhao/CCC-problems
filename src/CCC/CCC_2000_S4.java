package CCC;

import java.util.Arrays;
import java.util.Scanner;

public class CCC_2000_S4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		int c = s.nextInt();
		int[] club = new int[c];
		for(int i = 0; i < c; i++){
			club[i] = s.nextInt();
		}
		Arrays.sort(club);
		int[] clubs = new int[c];
		for(int i = 0; i < c; i++){
			clubs[i] = club[c-i-1];
		}
		
		int[] dp = new int[d+1];
		dp[0] = 0;
		
		for(int i = 1; i < d+1; i++){
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < c; j++){
				if(clubs[j] <= i &&  min > dp[i-clubs[j]]){
					dp[i] = dp[i-clubs[j]] + 1;
					min = dp[i - clubs[j]];
				}else if(min == Integer.MAX_VALUE){
					dp[i] = -1;
				}
				for(int l:dp)
					System.out.print(l + " ");
				
				System.out.println();
			}
		}
		
		System.out.println(dp[d]);
	}

}
