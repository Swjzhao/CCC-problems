package CCC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC_2012_S3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[1000];

		for (int i = 0; i < n; i++) {
			arr[s.nextInt() - 1]++;
		}

		int max = 0;
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			if (arr[i] == 0) {

			} else {
				if (arr[i] == max)
					arr1.add(i);
				if (arr[i] > max) {

					max = arr[i];

					arr1.clear();
					arr1.add(i);
				}

			}

		}

		if (arr1.size() < 2) {

			int cmax = max;

			max = 0;

			for (int i = 0; i < 1000; i++) {
				if (arr[i] == 0 || arr[i] == cmax) {

				} else {
					if (arr[i] == max)
						arr2.add(i);
					if (arr[i] > max) {
						max = arr[i];
						arr2.clear();
						arr2.add(i);
					}

				}

			}

			if (arr2.isEmpty()) {
				arr2 = arr1;
			}
			Collections.sort(arr1);
			Collections.sort(arr2);
			if (Math.abs(arr1.get(0) - arr2.get(arr2.size() - 1)) < Math.abs(arr1.get(arr1.size() - 1) - arr2.get(0))) {
				System.out.println(Math.abs(arr1.get(arr1.size() - 1) - arr2.get(0)));
			} else {
				System.out.println(Math.abs(arr1.get(0) - arr2.get(arr2.size() - 1)));
			}
		}else {
			Collections.sort(arr1);
			System.out.println(arr1.get(arr1.size()-1) - arr1.get(0));
		}
	}

}
