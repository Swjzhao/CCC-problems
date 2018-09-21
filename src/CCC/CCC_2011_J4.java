package CCC;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_2011_J4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean[][] arr = new boolean[400][200];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], true);
		}
		arr[200][1] = false;
		arr[200][2] = false;
		arr[200][3] = false;
		arr[201][3] = false;
		arr[202][3] = false;
		arr[203][3] = false;
		arr[203][4] = false;
		arr[203][5] = false;
		arr[204][5] = false;
		arr[205][5] = false;
		arr[205][4] = false;
		arr[205][3] = false;
		arr[206][3] = false;
		arr[207][3] = false;
		arr[207][4] = false;
		arr[207][5] = false;
		arr[207][6] = false;
		arr[207][7] = false;
		arr[206][7] = false;
		arr[205][7] = false;
		arr[204][7] = false;
		arr[203][7] = false;
		arr[202][7] = false;
		arr[201][7] = false;
		arr[200][7] = false;
		arr[199][7] = false;
		arr[199][6] = false;
		String d = s.next();
		int m;
		int px = 199;
		int py = 5;
		int cx = 199, cy = 5;
		boolean hv = true;
		boolean big = true;
		boolean safe = true;
		while (!d.equals("q")) {

			m = s.nextInt();
			safe = true;
			switch (d) {

			case "d":
				cy = py + m;

				for (int i = py; i < cy; i++) {
					if (!arr[px][i]) {
						safe = false;
						break;
					} else {
						arr[px][i] = false;
					}
				}
				break;
			case "u":

				cy = py - m;
				for (int i = cy; i < py; i++) {
					if (!arr[px][i]) {
						safe = false;
						break;
					} else {
						arr[px][i] = false;
					}
				}

				break;
			case "l":

				cx = px - m;
				for (int i = px; i < cx; i++) {
					if (!arr[py][i]) {
						safe = false;
						break;
					} else {
						arr[px][i] = false;
					}
				}

				break;
			case "r":

				cx = px + m;
				for (int i = cx; i < px; i++) {
					if (!arr[py][i]) {
						safe = false;
						break;
					} else {
						arr[py][i] = false;
					}
				}

				break;
			}
			if (!safe) {
				System.out.println(cx - 200 + " " + -1 * cy + " DANGER");
				break;
			} else {
				System.out.println(cx - 200 + " " + -1 * cy + " safe");
			}
			px = cx;
			py = cy;

			d = s.next();
		}

	}

}
