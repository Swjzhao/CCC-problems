package CCC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC_2014_S3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int test = s.nextInt();

		for (int i = 0; i < test; i++) {

			int n = s.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			ArrayList<Integer> arr1 = new ArrayList<>();
			for (int j = 0; j < n; j++) {

				arr.add(s.nextInt());

			}
			Collections.reverse(arr);
		
			int ii = 0;
			int index = 1;
			while (arr.size() > 0) {

				if (!arr.isEmpty() && arr.get(ii) == index) {
					arr.remove(ii);
					index++;
				} else if (!arr1.isEmpty() && arr1.get(arr1.size() - 1) == index) {

					arr1.remove(arr1.size() - 1);
					index++;

				} else {

					arr1.add(arr.get(ii));
					arr.remove(ii);

				}

			}
			
			if (!arr1.isEmpty()) {
				Collections.reverse(arr1);
				boolean b = true;
				for (int x : arr1) {
					if (x != index) {
						b = false;
						break;
					}
					index++;
				}
				if (b) {
					System.out.println("Y");
				} else {
					System.out.println("N");
				}
			} else {
				System.out.println("Y");
			}

		}

	}

}
