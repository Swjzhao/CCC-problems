import java.util.*;

public class App {

	public static int cc = 0;
	public static HashSet<String> hs = new HashSet<>();

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		boolean[][] played = new boolean[4][4];

		played[0][0] = true;
		played[1][1] = true;
		played[2][2] = true;
		played[3][3] = true;

		int[] score = new int[4];
		int gamesplayed = s.nextInt();

		int a, b, sa, sb;
		for (int i = 0; i < gamesplayed; i++) {
			a = s.nextInt();
			b = s.nextInt();
			sa = s.nextInt();
			sb = s.nextInt();

			if (sa > sb) {
				score[a - 1] += 3;
			} else if (sb > sa) {
				score[b - 1] += 3;
			} else {
				score[a - 1]++;
				score[b - 1]++;
			}

			played[a - 1][b - 1] = true;
			played[b - 1][a - 1] = true;
		}
		
		
		stimulate(played, score, 6 - gamesplayed, t);
		System.out.println(hs.size());

	}

	public static void stimulate(boolean[][] p, int[] s, int l, int t) {

		if (l == 0) {

			for (int i = 0; i < 4; i++) {
				
					if (s[i] > s[t-1]) {
				
						return;
					}
				
			}
			
			hs.add(s[0]+""+s[1]+""+s[2]+""+s[3]);
			return;

		} else {

			for (int r = 0; r < 4; r++) {
				for (int c = 0; c < 4; c++) {
					if (!p[r][c]) {
						p[r][c] = true;
						p[c][r] = true;
						s[r] += 3;

						stimulate(p, s, l - 1, t);

						s[r] -= 3;

						s[c] += 3;

						stimulate(p, s, l - 1, t);

						s[c] -= 3;
						
						s[r]++; s[c]++;
						
						stimulate(p,s,l-1,t);
						
						s[r]--; s[c]--;
						
						p[r][c] = false;
						p[c][r] = false;
					}
				}
			}

		}

	}

}