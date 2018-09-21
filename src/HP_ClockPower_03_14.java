import java.util.Scanner;

public class HP_ClockPower_03_14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] strr = str.split(":");
		String p1 = strr[0];
		String p2 = strr[1];
		int h = Integer.parseInt(p1);
		int m = Integer.parseInt(p2);
		int t = 20;
		switch (h % 10) {

		case 0:
			t += 6 * 15;
			break;
		case 1:
			t += 2 * 15;
			break;
		case 2:
			t += 5 * 15;
			break;
		case 3:
			t += 5 * 15;
			break;
		case 4:
			t += 4 * 15;
			break;
		case 5:
			t += 5 * 15;
			break;
		case 6:
			t += 6 * 15;
			break;
		case 7:
			t += 3 * 15;
			break;
		case 8:
			t += 7 * 15;
			break;
		case 9:
			t += 6 * 15;
			break;

		}
		if (h >= 10) {
			switch (h / 10) {

			case 0:
				t += 6 * 15;
				break;
			case 1:
				t += 2 * 15;
				break;
			case 2:
				t += 5 * 15;
				break;
			case 3:
				t += 5 * 15;
				break;
			case 4:
				t += 4 * 15;
				break;
			case 5:
				t += 5 * 15;
				break;
			case 6:
				t += 6 * 15;
				break;
			case 7:
				t += 3 * 15;
				break;
			case 8:
				t += 7 * 15;
				break;
			case 9:
				t += 6 * 15;
				break;

			}

		}
		switch (m % 10) {

		case 0:
			t += 6 * 15;
			break;
		case 1:
			t += 2 * 15;
			break;
		case 2:
			t += 5 * 15;
			break;
		case 3:
			t += 5 * 15;
			break;
		case 4:
			t += 4 * 15;
			break;
		case 5:
			t += 5 * 15;
			break;
		case 6:
			t += 6 * 15;
			break;
		case 7:
			t += 3 * 15;
			break;
		case 8:
			t += 7 * 15;
			break;
		case 9:
			t += 6 * 15;
			break;

		}
		switch (m / 10) {

		case 0:
			t += 6 * 15;
			break;
		case 1:
			t += 2 * 15;
			break;
		case 2:
			t += 5 * 15;
			break;
		case 3:
			t += 5 * 15;
			break;
		case 4:
			t += 4 * 15;
			break;
		case 5:
			t += 5 * 15;
			break;
		case 6:
			t += 6 * 15;
			break;
		case 7:
			t += 3 * 15;
			break;
		case 8:
			t += 7 * 15;
			break;
		case 9:
			t += 6 * 15;
			break;

		}
		System.out.println(t + " milliamps");
	}

}
