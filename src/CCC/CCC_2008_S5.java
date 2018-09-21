package CCC;

import java.util.Scanner;

public class CCC_2008_S5 {
	//2 test cases dont work
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[4];
		int[][] r = new int[5][4];
		r[0][0] = 2;
		r[0][1] = 1;
		r[0][3] = 2;
		r[1][0] = 1;
		r[1][1] = 1;
		r[1][2] = 1;
		r[1][3] = 1;
		r[2][2] = 2;
		r[2][3] = 1;
		r[3][1] = 3;
		r[4][0] = 1;
		r[4][3] = 1;
		for (int i = 0; i < n; i++) {
			int c = 0;
			for (int j = 0; j < 4; j++)
				arr[j] = s.nextInt();

			while (1 < 2) {
				boolean b = false;
				
				for (int j = 0; j < 5; j++) {

					if (arr[0] - r[j][0] >= 0 && arr[1] - r[j][1] >= 0 && arr[2] - r[j][2] >= 0
							&& arr[3] - r[j][3] >= 0) {
						arr[0] -= r[j][0];
						arr[1] -= r[j][1];
						arr[2] -= r[j][2];
						arr[3] -= r[j][3];
						b = true;
						c++;
						//break;
					}

				}
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + ":" + c);
				
				if(!b)
					break;

			}
			if(c%2 == 0)
				System.out.println("Roland");
			else
				System.out.println("Patrick");

		}
	}

}
