package CCC;

import java.util.Scanner;

public class CCC_2006_J5 {

	// 0 = notvisited
	// 1 = black (goes first)
	// 2 = white

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] board = new int[8][8];
		int black = 0, white = 0;
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				board[r][c] = 0;
			}
		}
		char type = s.next().charAt(0);
		construct(board, type);
		int n = s.nextInt();

		int r = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			r = s.nextInt() - 1;
			c = s.nextInt() - 1;
			if (i % 2 == 0) {
				board[r][c] = 1;

				// left right
				for (int j = c + 1; j < 8; j++) {
					if (board[r][j] == 0) {
						break;
					}
					if (board[r][j] == 1) {
						for (int jj = c; jj < j; jj++) {
							board[r][jj] = 1;
						}
						break;
					}
				}

				for (int j = c - 1; j > -1; j--) {

					if (board[r][j] == 0) {

						break;
					}
					if (board[r][j] == 1) {
						for (int jj = c; jj > j; jj--) {

							board[r][jj] = 1;
						}
						break;
					}
				}
				// top down
				for (int j = r + 1; j < 8; j++) {
					if (board[j][c] == 0) {
						break;
					}
					if (board[j][c] == 1) {
						for (int jj = r; jj < j; jj++) {
							board[jj][r] = 1;
						}
						break;
					}
				}
				for (int j = r - 1; j > -1; j--) {
					if (board[j][c] == 0) {
						break;
					}
					if (board[j][c] == 1) {
						for (int jj = r; jj > j; jj--) {
							board[jj][c] = 1;
						}
						break;
					}
				}
				// diagonal
				int t = 1;

				while (r - t >= 0 && c - t >= 0) {
					if (board[r - t][c - t] == 0) {
						break;
					}
					if (board[r - t][c - t] == 1) {
						for (int tt = 0; tt < t; tt++) {

							board[r - tt][c - tt] = 1;
						}
						break;
					}
					t++;
				}

				t = 1;
				while (r + t < 8 && c + t < 8) {
					if (board[r + t][c + t] == 0) {
						break;
					}
					if (board[r + t][c + t] == 1) {
						for (int tt = 0; tt < t; tt++) {

							board[r + tt][c + tt] = 1;
						}
						break;

					}
					t++;
				}
				t = 1;
				while (r + t < 8 && c - t >= 0) {
					if (board[r + t][c - t] == 0) {
						break;
					}
					if (board[r + t][c - t] == 1) {
						for (int tt = 0; tt < t; tt++) {

							board[r + tt][c - tt] = 1;

						}
						break;

					}
					t++;
				}
				t = 1;
				while (r - t >= 0 && c + t < 8) {
					if (board[r - t][c + t] == 0) {
						break;
					}
					if (board[r - t][c + t] == 1) {
						for (int tt = 0; tt < t; tt++) {

							board[r - tt][c + tt] = 1;
						}
						break;

					}
					t++;
				}

			} else {
				board[r][c] = 2;

				// left right
				for (int j = c + 1; j < 8; j++) {
					if (board[r][j] == 0) {
						break;
					}
					if (board[r][j] == 2) {
						for (int jj = c; jj < j; jj++) {
							board[r][jj] = 2;
						}
						break;
					}
				}

				for (int j = c - 1; j > -1; j--) {

					if (board[r][j] == 0) {

						break;
					}
					if (board[r][j] == 2) {
						for (int jj = c; jj > j; jj--) {

							board[r][jj] = 2;
						}
						break;
					}
				}
				// top down
				for (int j = r + 1; j < 8; j++) {
					if (board[j][c] == 0) {
						break;
					}
					if (board[j][c] == 2) {
						for (int jj = r; jj < j; jj++) {
							board[jj][r] = 2;
						}
						break;
					}
				}
				for (int j = r - 1; j > -1; j--) {
					if (board[j][c] == 0) {
						break;
					}
					if (board[j][c] == 2) {
						for (int jj = r; jj > j; jj--) {
							board[jj][c] = 2;
						}
						break;
					}
				}
				// diagonal
				int t = 1;

				while (r - t >= 0 && c - t >= 0) {
					if (board[r - t][c - t] == 0) {
						break;
					}
					if (board[r - t][c - t] == 2) {
						for (int tt = 0; tt < t; tt++) {

							board[r - tt][c - tt] = 2;
						}
						break;
					}
					t++;
				}

				t = 1;
				while (r + t < 8 && c + t < 8) {
					if (board[r + t][c + t] == 0) {
						break;
					}
					if (board[r + t][c + t] == 2) {
						for (int tt = 0; tt < t; tt++) {

							board[r + tt][c + tt] = 2;
						}
						break;

					}
					t++;
				}
				t = 1;
				while (r + t < 8 && c - t >= 0) {
					if (board[r + t][c - t] == 0) {
						break;
					}
					if (board[r + t][c - t] == 2) {
						for (int tt = 0; tt < t; tt++) {

							board[r + tt][c - tt] = 2;

						}
						break;

					}
					t++;
				}
				t = 1;
				while (r - t >= 0 && c + t < 8) {
					if (board[r - t][c + t] == 0) {
						break;
					}
					if (board[r - t][c + t] == 2) {
						for (int tt = 0; tt < t; tt++) {

							board[r - tt][c + tt] = 2;
						}
						break;

					}
					t++;
				}

			}

//			System.out.println();
//			for (int x = 0; x < 8; x++) {
//
//				for (int y = 0; y < 8; y++) {
//					System.out.print(board[x][y]);
//				}
//				System.out.println();
//			}
			black = 0;
			white = 0;
			for (int rr = 0; rr < 8; rr++) {
				for (int cc = 0; cc < 8; cc++) {
					if (board[rr][cc] == 1) {
						black++;
					} else if (board[rr][cc] == 2) {

						white++;
					}
				}
			}

		}
		if (n == 0) {
			for (int rr = 0; rr < 8; rr++) {
				for (int cc = 0; cc < 8; cc++) {
					if (board[rr][cc] == 1) {
						black++;
					} else if (board[rr][cc] == 2) {

						white++;
					}
				}
			}
		}
		System.out.println(black + " " + white);

	}

	public static void construct(int[][] board, char type) {

		switch (type) {

		case 'a':
			board[3][4] = 1;
			board[4][3] = 1;
			board[3][3] = 2;
			board[4][4] = 2;

			break;
		case 'b':
			board[0][0] = 1;
			board[1][1] = 1;
			board[2][2] = 1;
			board[3][3] = 1;
			board[4][4] = 1;
			board[5][5] = 1;
			board[6][6] = 1;
			board[7][7] = 1;
			board[0][7] = 2;
			board[1][6] = 2;
			board[2][5] = 2;
			board[3][4] = 2;
			board[4][3] = 2;
			board[5][2] = 2;
			board[6][1] = 2;
			board[7][0] = 2;

			break;
		case 'c':
			board[0][2] = 1;
			board[1][2] = 1;
			board[2][2] = 1;
			board[3][2] = 1;
			board[4][2] = 1;
			board[5][2] = 1;
			board[6][2] = 1;
			board[7][2] = 1;
			board[0][3] = 1;
			board[1][3] = 1;
			board[2][3] = 1;
			board[3][3] = 1;
			board[4][3] = 1;
			board[5][3] = 1;
			board[6][3] = 1;
			board[7][3] = 1;
			board[0][4] = 2;
			board[1][4] = 2;
			board[2][4] = 2;
			board[3][4] = 2;
			board[4][4] = 2;
			board[5][4] = 2;
			board[6][4] = 2;
			board[7][4] = 2;
			board[0][5] = 2;
			board[1][5] = 2;
			board[2][5] = 2;
			board[3][5] = 2;
			board[4][5] = 2;
			board[5][5] = 2;
			board[6][5] = 2;
			board[7][5] = 2;

			break;

		}

	}
}
