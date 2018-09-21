package DP;

public class Q1_a_b {

	public static void main(String[] args) {

		int[] arr = {-6,12,-7,0,14,-7,5};		
		//sum(arr);
		product(arr);
		System.out.println();
	}

	public static void sum(int[] arr) {

		int[] v = new int[arr.length+1];
		int a = 0;

		for (int i = 1; i < arr.length+1; i++) {
			v[i] = v[i - 1] + arr[i-1];
			if (v[i] < 0)
				v[i] = 0;
			if (a < v[i]) {

				a = v[i];

			}
		}
		for (int i : v) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(a);
	}
	
	public static void product(int[] arr){
		
		int[] v = new int[arr.length];
		int a = 0, neg = 0;
		v[0] = arr[0];
		for(int i = 1; i < arr.length; i++){
			//System.out.println(arr[i] + " " + v[i]);
						
			if(arr[i] != 0 && v[i-1]!=0)
			v[i] = arr[i]*v[i-1];
			else
			v[i] = arr[i];
				
			
			if(v[i] > a){
				a = v[i];
			}
			
			
		}
		
		for (int i : v) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(a);
	}

	public static int largestProduct(int[] ints) {
		int max = 0, minProduct = 1, maxProduct = 1;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] >= 0) {
				maxProduct = Math.max(maxProduct * ints[i], ints[i]);
				minProduct = Math.min(minProduct * ints[i], ints[i]);
			} else {
				int temp = maxProduct;
				maxProduct = Math.max(minProduct * ints[i], ints[i]);
				minProduct = Math.min(temp * ints[i], ints[i]);
			}
			max = Math.max(max, maxProduct);
		}
		return max;
	}
}
