package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2014_J5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Boolean b = true;
		ArrayList<String> fr = new ArrayList<>();
		ArrayList<String> sr = new ArrayList<>();

		String s1 = "", s2 = "", s3 = "", s4 = "";

		for (int i = 0; i < n; i++) {
			fr.add(s.next());
		}
		for (int i = 0; i < n; i++) {
			sr.add(s.next());
		}

		for (int i = 0; i < n; i++) {
			s1 = fr.get(i);
			s2 = sr.get(i);

			s3 = fr.get(sr.indexOf(s1));
			s4 = sr.get(fr.indexOf(s2));

			if (s1.equals(s2) || !(s1.equals(s4) && s2.equals(s3))) {
				b = false;
				break;
			}

		}
		if (b) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}

}
