package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2013_J5 {

	public static int counter = 0;
	public static ArrayList<String> ia = new ArrayList<>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tn = s.nextInt();
		int gamesplayed = s.nextInt();
		int[] score = new int[4];
		int[] tp = new int[4];
		int[][] record = new int[4][4];
		boolean[][] wpw = new boolean[4][4];

		wpw[0][0] = true;
		wpw[1][1] = true;
		wpw[2][2] = true;
		wpw[3][3] = true;

		int a = 0, b = 0;
		int sa = 0, sb = 0;
		for (int i = 0; i < gamesplayed; i++) {
			a = s.nextInt();
			tp[a - 1]++;
			b = s.nextInt();
			tp[b - 1]++;
			sa = s.nextInt();
			sb = s.nextInt();

			wpw[a - 1][b - 1] = true;

			wpw[b - 1][a - 1] = true;

			if (sa > sb) {
				score[a - 1] += 3;
				record[a-1][b-1] = 1;
				record[b-1][a-1] = 2;
			} else if (sa < sb) {
				score[b - 1] += 3;
				record[a-1][b-1] = 2;
				record[b-1][a-1] = 1;
			} else {
				score[a - 1]++;
				score[b - 1]++;
			}
		}

		getWin(score,record, wpw, 6 - gamesplayed, (tn - 1));

		System.out.println(counter);

	}

	public static void getWin(int[] score, int[][] record, boolean[][] gamesplayed, int left,
			int t) {

		int cc = counter;

		boolean b = true;

		if (left == 0) {

			for (int i = 0; i < 4; i++) {
				if (i != t) {
					if (score[i] >= score[t]) {
						b = false;
						break;
					}
				}
			}
			if (b) {
				String sss = "";
				for(int i = 0; i < gamesplayed.length; i++){
					for(int j = 0; j < gamesplayed[0].length; j++){
						sss += record[i][j];
					}
				}
				
				if (ia.contains(sss)) {

				} else {
					ia.add(sss);
					counter += 1;

				}
			}

			return;
		} else {
			for (int r = 0; r < 4; r++) {
				for (int c = 0; c < 4; c++) {
					if (!gamesplayed[r][c] && !gamesplayed[c][r]) {
						gamesplayed[r][c] = true;
						gamesplayed[c][r] = true;
						score[r] += 3;
						int holdrc = record[r][c];
						int holdcr = record[c][r];

						record[r][c] = 1;
						record[c][r] = 2;
						getWin(score, record,gamesplayed, left - 1, t);
						score[r] -= 3;
						record[r][c] = holdrc;
						record[c][r] = holdcr;

						score[c] += 3;
						record[r][c] = 2;
						record[c][r] = 1;
						getWin(score, record,gamesplayed, left - 1, t);
						record[r][c] = holdrc;
						record[c][r] = holdcr;
						score[c] -= 3;

						score[r]++;
						score[c]++;
						getWin(score, record,gamesplayed, left - 1, t);
						score[r]--;
						score[c]--;

						gamesplayed[r][c] = false;
						gamesplayed[c][r] = false;
					}
				}
			}

		}

	}

}
