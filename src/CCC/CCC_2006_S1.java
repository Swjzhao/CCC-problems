package CCC;

import java.util.Scanner;

public class CCC_2006_S1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String s1 = s.next();
		String s2 = s.next();
		int n = s.nextInt();
		int[][] arr = new int[5][2];
		for (int i = 0; i < 10; i++) {
			if (s1.charAt(i) <= 'Z') {
				arr[i /2][0]++;
			} else {
				arr[i / 2][1]++;
			}
			if (s2.charAt(i) <= 'Z') {
				arr[i / 2][0]++;
			} else {
				arr[i / 2][1]++;
			}

		}
		boolean[][] possible = new boolean[5][2];

		String[] p = new String[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = s.next();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					if (arr[i][j] > 0) {
						possible[i][j] = true;
					}
				} else {
					if (arr[i][j] > 1) {
						possible[i][j] = true;
					}
				}
			}
		}
//		for(int i = 0; i < 5; i++){
//			for(int j = 0; j < 2; j++){
//				if(j == 0){
//				System.out.print((char)(i+'A') + " " + possible[i][j]);
//				}else{
//					System.out.print((char)(i+'a') + " " + possible[i][j]);
//				}
//			}
//			System.out.println();
//		}

		for (int i = 0; i < n; i++) {
			boolean b = true;
			for (int j = 0; j < p[i].length(); j++) {
				char c = p[i].charAt(j);
				if (c <= 'Z') {
					//System.out.println(c + " " + possible[c-'A'][0]);
					if (possible[c-'A'][0]) {

					} else {
						b = false;
						break;
					}
				} else {
					//System.out.println(c + " " + possible[c-'a'][1]);
					if (possible[c-'a'][1]) {

					} else {
						b = false;
						break;
					}
				}
			}
			System.out.println();
			if(b){
				System.out.println("Possible baby.");
			}else{
				System.out.println("Not their baby!");
			}

		}
	}

}
