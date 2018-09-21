package DP;

public class LIS {

	public static void main(String[] args) {
		String str = "GACBDFB";
		char[] c = str.toCharArray();
		int[] arr = new int[c.length];
		for(int i = 0; i < c.length; i++){
			char chr = c[i];
			arr[i] = (int)chr;
		}
		System.out.println(LIS(arr));
	}
	
	public static int LIS(int[] arr){
		
		int n = arr.length;
		int[] lis = new int[n]; // (longest increasing subsequence from 0 to i
		
		for(int i = 0; i < n; i++){
			lis[i] = 1;
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				if(arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i]++;
			}
		}
		
		for(int i = 0; i < n; i++){
		
				System.out.print(lis[i]);
			
		}
		System.out.println();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(lis[i] > max)
				max = lis[i];
		}
		
		return max;
		
	}

}
