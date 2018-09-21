package CCC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC_2015_S5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int m = s.nextInt();
		ArrayList<Integer> b = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			b.add(s.nextInt());
		}
		Collections.sort(b);
		if (a.length > 1) {
			int[] arr = new int[n + 1];
			arr[0] = 0;
			arr[1] = a[0];
			arr[2] = a[1];

			int max = Integer.max(arr[1], arr[2]);

			for (int i = 3; i < arr.length; i++) {

				arr[i] = Integer.max(arr[i - 2] + a[i - 1], arr[i - 3] + a[i - 1]);
				if (arr[i] > max) {
					max = arr[i];
				}

			}

			System.out.println(max);

		} else {
			System.out.println(a[0]);
		}

	}

}
