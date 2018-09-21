package DP;

public class LISTR {

	public static void main(String[] args) {

		String str = "GACBDFB";
		char[] c = str.toCharArray();
		int[] arr = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			char chr = c[i];
			arr[i] = (int) chr;
		}
		System.out.println(LISTR(arr));

	}

	public static int LISTR(int[] arr) {

		int n = arr.length;
		int[] listr = new int[n]; // longest substring withn 0 to i

		for (int i = 0; i < n; i++) {
			listr[i] = 1;
		}

		for (int i = 0; i < n; i++) {
			int m = 1;
			for (int j = 1; j <= i; j++) {
				
				if (arr[j] > arr[j - 1]) {
					m++;
				}else{
					
					m = 1;
				}
				if(listr[i] < m ){
					listr[i] = m;
					}
			}
		}

		for (int i = 0; i < n; i++) {

			System.out.print(listr[i]);

		}
		System.out.println();

		

		return listr[n-1];

	}

}
