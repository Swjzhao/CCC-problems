import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Array_2_D {

	public static void main(String[] args) {

		// 4 5 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20

		Scanner s = new Scanner(in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] table = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				table[i][j] = s.nextInt();
			}
		}

		printBoard(table);
		out.println("Sum:" + sum(table));
		out.println("Average:" + average(table));
		out.println("Max:" + max(table));
		out.println("Min:" + min(table));
		flipHorizonal(table);
		out.println();
		rotateClock(table);
		out.println();
		rotateCounterClock(table);
		out.println();
		uTurn(table);
		out.println();
		spiral(table);
	}

	public static void defineArr(int[][] ntable, int[][] table) {

		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				ntable[r][c] = table[r][c];
			}
		}
	}

	public static void printBoard(int[][] table) {
		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				System.out.print(table[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int sum(int[][] table) {
		int i = 0;

		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				i += table[r][c];
			}
		}

		return i;
	}

	public static double average(int[][] table) {

		double d = 0;
		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				d += table[r][c];
			}
		}
		d /= (table.length) * (table[0].length);
		return d;
	}

	public static int max(int[][] table) {
		int i = Integer.MIN_VALUE;
		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				if (i < table[r][c]) {
					i = table[r][c];
				}
			}
		}
		return i;
	}

	public static int min(int[][] table) {
		int i = Integer.MAX_VALUE;
		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				if (i > table[r][c]) {
					i = table[r][c];
				}
			}
		}
		return i;
	}

	public static void flipHorizonal(int[][] table) {

		int[][] ntable = new int[table.length][table[0].length];
		defineArr(ntable, table);
		for (int r = 0; r < ntable.length; r++) {
			for (int c = 0; c < ntable[0].length; c++) {
				ntable[r][c] = table[r][table[0].length - c - 1];
			}
		}
		printBoard(ntable);
		System.out.println();
		flipVertical(ntable);
	}

	public static void flipVertical(int[][] table) {

		int[][] ntable = new int[table.length][table[0].length];
		defineArr(ntable, table);
		for (int r = 0; r < ntable.length; r++) {
			for (int c = 0; c < ntable[0].length; c++) {
				ntable[r][c] = table[table.length - 1 - r][c];
			}
		}
		printBoard(ntable);

	}

	public static void rotateClock(int[][] table) {

		int[][] ntable = new int[table[0].length][table.length];

		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				ntable[c][table.length - r - 1] = table[r][c];
			}
		}
		printBoard(ntable);

	}

	public static void rotateCounterClock(int[][] table) {

		int[][] ntable = new int[table[0].length][table.length];

		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				ntable[table[0].length - 1 - c][r] = table[r][c];
			}
		}
		printBoard(ntable);

	}

	public static void uTurn(int[][] table) {

		int[][] ntable = new int[table.length][table[0].length];

		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[0].length; c++) {
				if (r % 2 == 0) {
					ntable[r][c] = table[r][c];
				} else {
					ntable[r][table[0].length - c - 1] = table[r][c];
				}
			}
		}
		printBoard(ntable);

	}

	public static void spiral(int[][] table){
		
		// 1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12
		
		int[][] ntable = new int[table.length][table[0].length];
		int r1 = 0, c1 = 0, r2 = table.length-1, c2 = table[0].length-1;
		for(int i = 0; i < table.length*table[0].length;i++){
			
			if(i%4 == 0){
				for(int c = c1; c <= c2;c++){
					System.out.print(table[r1][c]);
					System.out.print(" ");
				}
				r1++;
			}else if(i%4 == 1){
				for(int r = r1; r <= r2;r++){
					System.out.print(table[r][c2]);
					System.out.print(" ");
				}
				c2--;
			}else if(i%4 == 2){
				for(int c = c2; c >= c1;c--){
					System.out.print(table[r2][c]);
					System.out.print(" ");
				}
				r2--;
			}else if(i%4 == 3){
				for(int r = r2; r >= r1;r--){
					System.out.print(table[r][c1]);
					System.out.print(" ");
				}
				c1++;
			}
			if(c1 >= c2 && r1 >= r2){
				break;
			}
			
			
		}
		
	}
}
