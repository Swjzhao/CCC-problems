package CCC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CCC_2014_S4 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = s.nextInt();
		int[][] glass = new int[n * 2][4];
		int[] yy = new int[n * 2 + 1];
		int minx = Integer.MAX_VALUE, maxx = Integer.MIN_VALUE, miny = Integer.MAX_VALUE, maxy = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {

			int x = s.nextInt(), y = s.nextInt(), x1 = s.nextInt(), y1 = s.nextInt(), tint = s.nextInt();

			minx = Math.min(x, minx);
			miny = Math.min(y, miny);
			maxx = Math.max(x1, maxx);
			maxy = Math.max(y1, maxy);
			int[] t1 = { x, y, y1, tint };
			int[] t2 = { x1, y, y1, -tint };
			glass[i] = t1;
			glass[i + n] = t2;
			yy[i + 1] = y;
			yy[i + n + 1] = y1;
		}

		Arrays.sort(glass, new Comparator<int[]>() {
			public int compare(int[] first, int[] second) {
				return (first[0] - second[0]);
			}
		});
		Arrays.sort(yy);

		int[] sweeper = new int[maxy - miny + 1];

		int index = 0;
		int value = 0;
		int valuet = 0;

		for (int i = minx; i < maxx; i++) {

			if (i == glass[index][0]) {

				for (int j = glass[index][1]; j <= glass[index][2]; j++) {

					int temp = sweeper[j - miny];
					if (sweeper[j - miny] >= t) {
						value++;
					}
					sweeper[j - miny] += glass[index][3];
				}

				index++;
				if (index < n * 2 && glass[index][0] == glass[index - 1][0]){
					i--;
				}
			}

		}
	

		System.out.println(value);

	}

}
