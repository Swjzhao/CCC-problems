package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2006_J3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		String str = s.next();
		while (!str.equals("halt")) {

			arr.add(str);
			str = s.next();
		}
		int time = 0;
		for (int i = 0; i < arr.size(); i++) {
			time = 0;
			char[] charr = arr.get(i).toCharArray();
			time = charr.length;
			int last = 0;
			for (int j = 0; j < charr.length; j++) {
				int tis;
				if (charr[j] > 'v') {
					tis = 9;
					if (charr[j] > 'v' + 3) {
						time += 3;
					} else if (charr[j] > 'v' + 2) {
						time += 2;
					} else if (charr[j] > 'v' + 1) {
						time += 1;
					}
				} else if (charr[j] > 's') {
					tis = 8;
					if (charr[j] > 's' + 2) {
						time += 2;
					} else if (charr[j] > 's' + 1) {
						time += 1;
					}

				} else if (charr[j] > 'o') {
					tis = 7;
					if (charr[j] > 'o' + 3) {
						time += 3;
					} else if (charr[j] > 'o' + 2) {
						time += 2;
					} else if (charr[j] > 'o' + 1) {
						time += 1;
					}
				} else if (charr[j] > 'l') {
					tis = 6;
					if (charr[j] > 'l' + 2) {
						time += 2;
					} else if (charr[j] > 'l' + 1) {
						time += 1;
					}
				} else if (charr[j] > 'i') {
					tis = 5;
					if (charr[j] > 'i' + 2) {
						time += 2;
					} else if (charr[j] > 'i' + 1) {
						time += 1;
					}
				} else if (charr[j] > 'f') {
					tis = 4;
					if (charr[j] > 'f' + 2) {
						time += 2;
					} else if (charr[j] > 'f' + 1) {
						time += 1;
					}
				} else if (charr[j] > 'c') {
					tis = 3;
					if (charr[j] > 'c' + 2) {
						time += 2;
					} else if (charr[j] > 'c' + 1) {
						time += 1;
					}
				} else {
					tis = 2;
					if (charr[j] > 'a' + 1) {
						time += 2;
					} else if (charr[j] > 'a') {
						time += 1;
					}
				}
				//System.out.println(tis + " " + last);
				if (tis == last) {
					time += 2;
				}
				last = tis;

			}
			System.out.println(time);
		}

	}

}
