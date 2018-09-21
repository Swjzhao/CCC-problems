package NotFinished;
import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2003_J5_NF {

	static int nOrooms = 0;
	static int leftover = 0;

	public static void main(String[] args) {

		// 105
		// 14
		// 16
		// IIIIIIIIIIIIIIII
		// I......I.......I
		// I......III.....I
		// I........I.....I
		// I........IIIIIII
		// IIIIIIIIII.....I
		// I.I......I.....I
		// III..III.I.....I
		// I....I.IIIII...I
		// I....I.....III.I
		// I....I.......I.I
		// I....I.....III.I
		// I....I.....I...I
		// IIIIIIIIIIIIIIII

		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		int r = s.nextInt();
		int c = s.nextInt();
		boolean table[][] = new boolean[r][c];

		for (int x = 0; x < r; x++) {
			String str = s.next();
			for (int y = 0; y < c; y++) {
				if (str.charAt(y) == 'I') {
					table[x][y] = true;
				} else {
					table[x][y] = false;
				}
			}
		}

		// for(int x = 0; x < r;x++){
		// for(int y = 0; y < c; y++){
		// 	 System.out.print(table[x][y]);
		// }
		// System.out.println();
		// }

	}

	public static void getRoom(boolean[][] table, ArrayList<Integer> sizeOfRooms) {

	}

}
