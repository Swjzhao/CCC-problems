package CCC;

import java.util.Scanner;

public class CCC_2012_S2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		int t = 0;

		for (int i = 0; i < str.length(); i += 2) {

			if (i > 1) {
				if (getV(str.charAt(i + 1)) > getV(str.charAt(i - 1))) {
					t -= 2 * Integer.parseInt(str.charAt(i - 2) + "")
							* getV(str.charAt(i - 1));
					t += Integer.parseInt(str.charAt(i) + "")
							* getV(str.charAt(i + 1));

				} else {
					t += Integer.parseInt(str.charAt(i) + "")
							* getV(str.charAt(i + 1));

				}
			} else {
				t += Integer.parseInt(str.charAt(i) + "")
						* getV(str.charAt(i + 1));

			}
		}

		System.out.println(t);

	}

	public static int getV(char c) {

		switch (c) {

		case 'I':
			return 1;

		case 'V':
			return 5;

		case 'X':
			return 10;

		case 'L':
			return 50;

		case 'C':
			return 100;

		case 'D':
			return 500;

		case 'M':
			return 1000;

		}
		return 0;

	}

}
