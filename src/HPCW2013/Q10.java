package HPCW2013;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		int total = 0;
		for(int i = 0; i < 10; i++){
			arr[i] = s.nextInt();
			total += arr[i];
		}
		Arrays.sort(arr);
		int a = 0, b = 0, c = 0, d = 0, e = 0 ;
		c = (total/4) - (arr[0] + arr[9]);
		a = arr[1] - c;
		b = arr[0] - a;
		e = arr[8] - c;
		d = arr[9] - e;
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}

}
