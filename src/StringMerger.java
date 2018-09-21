import java.util.Arrays;
import java.util.Scanner;

public class StringMerger {

	static char[] c = null;
	static String ms = "";

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// String s1 = s.next();
		// String s2 = s.next();

		String s1 = "ACQ";
		String s2 = "BEF";

		String s3 = merge(s1, s2, 0);
		System.out.println(s3);
	}

	public static String merge(String s1, String s2, int i) {

		if (s1.length() == 0&& s2.length() == 0) {
			return "";
		} else if (s1.length() == 0) {
			return s2;
		} else if (s2.length() == 0) {
			return s1;
		} else {
			if (s1.charAt(i) <= s2.charAt(i)) {
				return "" + s1.charAt(i) + merge(s1.substring(1 + i), s2, i);
			} else {
				return "" + s2.charAt(i) + merge(s1, s2.substring(1 + i), i);
			}
		}
		
	}

}
