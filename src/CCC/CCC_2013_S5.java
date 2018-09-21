package CCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_2013_S5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n+1];
		
		
		int cost = 0;
		Arrays.fill(arr, 50000);
		arr[0] = 0;
		arr[1] = 0;
		for(int i = 1; i < n+1;i++){
			for(int j = 1; j < i+1; j++){
				if(i%j == 0){
					cost = arr[i-1] + i/j;
					if(cost <= arr[i] && i <= n){
						arr[i] = cost;
					}
				}
			}
			//System.out.println("ok");
		}
//		for(int i :arr)
//			System.out.print(i + " ");
		
		System.out.println();
		
		System.out.println(arr[n] + " " + cost);
		
		
	}

}
