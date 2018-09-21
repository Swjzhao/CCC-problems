package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2008_J4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] parts = str.split("\\s+");
		ArrayList<String> arr = new ArrayList<>();
		for (String ss : parts) {
			arr.add(ss);
		}
		String string = preToPost(arr);
		System.out.println(string);

	}

	public static String preToPost(ArrayList<String> arr) {

		String res = "";

		while (arr.size() != 1) {
			for (int i = 0; i < arr.size(); i++) {
				if (isOpe(arr.get(i))) {
					if (i + 2 >= arr.size())
						return null;

					if (!isOpe(arr.get(i + 1)) && !isOpe(arr.get(i + 2))) {
						// pre -> post
						arr.set(i, arr.get(i + 1) + " " + arr.get(i + 2) + " "
								+ arr.get(i) + " ");
						arr.remove(i + 2);
						arr.remove(i + 1);
						break;
					}
				}
			}
		}

		return arr.get(0);
	}

	public static boolean isOpe(String s) {
		if (s.length() != 1)
			return false;

		else if (s.equals("+") || s.equals("-"))
			return true;
		else
			return false;
	}

}
