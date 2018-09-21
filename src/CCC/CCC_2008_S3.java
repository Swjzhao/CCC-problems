package CCC;
import java.util.Scanner;

public class CCC_2008_S3 {

	public static int minStep = Integer.MAX_VALUE;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		boolean[][] bb;
		char[][] cc;
		int[] ii = new int[t];
		int r, c;
		String map;

		for (int i = 0; i < t; i++) {
			minStep = Integer.MAX_VALUE;
			r = s.nextInt();
			c = s.nextInt();
			bb = new boolean[r][c];
			
			cc = new char[r][c];
			s.nextLine();
			for (int j = 0; j < r; j++) {
				map = s.nextLine();
				for (int k = 0; k < c; k++) {

					cc[j][k] = map.charAt(k);

				}
			}
//			bb[0][0] = true;
//			move(0, 0, cc, bb, 0);
			enterAndMove(0, 0, cc, bb, 1);
			if(minStep == Integer.MAX_VALUE){
				minStep = -1;
			}
			System.out.println(minStep);

		}

	}

	public static void move(int r, int c, char[][] directions,
			boolean[][] visited, int step) {

		System.out.println(r + " " + c);	

		if (r == directions.length - 1 && c == directions[0].length - 1) {
			if (minStep > step) {
				minStep = step;
			}
			return;
		} else {

			switch (directions[r][c]) {

			case '+':
			
				if (r - 1 >= 0 && visited[r - 1][c] == false) {
					visited[r - 1][c] = true;
					move(r - 1, c, directions, visited, step + 1);
					visited[r - 1][c] = false;
				}
		
				if (r + 1 < directions.length && visited[r + 1][c] == false) {
					visited[r + 1][c] = true;
					move(r + 1, c, directions, visited, step + 1);
					visited[r + 1][c] = false;
				}
				if (c - 1 >= 0 && visited[r][c - 1] == false) {
					visited[r][c - 1] = true;
					move(r, c - 1, directions, visited, step + 1);
					visited[r][c - 1] = false;
				}
				if (c + 1 < directions[0].length && visited[r][c + 1] == false) {
					visited[r][c + 1] = true;
					move(r, c + 1, directions, visited, step + 1);
					visited[r][c + 1] = false;
				}
				break;
			case '|':
			
				if (r - 1 >= 0 && visited[r - 1][c] == false) {
					visited[r - 1][c] = true;
					move(r - 1, c, directions, visited, step + 1);
					visited[r - 1][c] = false;
				}
			
				if (r + 1 < directions.length && visited[r + 1][c] == false) {
					visited[r + 1][c] = true;
					move(r + 1, c, directions, visited, step + 1);
					visited[r + 1][c] = false;
				}
				break;
			case '-':
				if (c - 1 >= 0 && visited[r][c - 1] == false) {
					visited[r][c - 1] = true;
					move(r, c - 1, directions, visited, step + 1);
					visited[r][c - 1] = false;
				}
				if (c + 1 < directions[0].length && visited[r][c + 1] == false) {
					visited[r][c + 1] = true;
					move(r, c + 1, directions, visited, step + 1);
					visited[r][c + 1] = false;
				}
				break;
			case '*':
				visited[r][c] = true;
				break;
			}
		}
	}
	
	public static void enterAndMove(int r, int c, char[][] directions,
			boolean[][] visited, int step) {
		if(!(r>=0 && r<directions.length&&c>=0&&c<directions[0].length&&visited[r][c]==false&&directions[r][c]!='*'))
			return;
		
		
		if (step > directions.length + directions[0].length) {
			return;
		}

		if (r == directions.length - 1 && c == directions[0].length - 1) {
			if (minStep > step) {
				minStep = step;
			}
			return;
		} else {
			visited[r][c] = true;
			switch (directions[r][c]) {

			case '+':
				enterAndMove(r - 1, c, directions, visited, step + 1);
				enterAndMove(r + 1, c, directions, visited, step + 1);
				enterAndMove(r, c - 1, directions, visited, step + 1);
				enterAndMove(r, c + 1, directions, visited, step + 1);

				break;
			case '|':
		
				enterAndMove(r - 1, c, directions, visited, step + 1);
		
				enterAndMove(r + 1, c, directions, visited, step + 1);
				break;
			case '-':
				enterAndMove(r, c - 1, directions, visited, step + 1);
				enterAndMove(r, c + 1, directions, visited, step + 1);
				break;
			case '*':
				break;
			}
			visited[r][c] = false;
		}
	}

}
