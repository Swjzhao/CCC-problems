package CCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_2006_J4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean[] done = new boolean[7];
		Arrays.fill(done, false);
		ArrayList<String> task = new ArrayList<>();

		task.add("2");
		task.add("");
		task.add("");
		task.add("13");
		task.add("3");
		task.add("");
		task.add("1");

		int a = s.nextInt();
		int b = s.nextInt();
		String str = "";

		while (a != 0 && b != 0) {

			task.set(b - 1, task.get(b - 1) + a);
			a = s.nextInt();
			b = s.nextInt();
		}

		boolean bool;
		int t = 0;
		for (int x = 0; x < 7; x++) {
			
				for (int i = 0; i < 7; i++) {
					//System.out.println(i);
					if (done[i]) {

					} else {
						
						bool = true;
						for (int j = 0; j < task.get(i).length(); j++) {

							if (!done[Integer.parseInt(task.get(i).charAt(j)
									+ "") - 1]) {

								bool = false;
								break;
							}
						}
						if (task.get(i).length() == 0) {
							bool = true;
							str += i + 1 + " ";
							done[i] = true;
							break;
						} else {
							if (!bool) {
								
							} else {
								str += i + 1 + " ";
								done[i] = true;
								break;
							}
						}
					}
				
			}
			
		}
		if (str.length() < 14) {
			
			System.out.println("Cannot complete these tasks. Going to bed.");
		} else {
			System.out.println(str);
		}
	}

}
