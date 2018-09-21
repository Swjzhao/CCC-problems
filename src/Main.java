

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	private static int counter;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int t = s.nextInt();
		HashMap<String, HashSet<String>> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < t; i++) {

			int x = s.nextInt();
			int y = s.nextInt();
			int c = s.nextInt();
			if (map.containsKey(x)) {
				map.get(x + "").add(y + " " + c);
			} else {
				map.put(x + "", new HashSet<String>());
				map.get(x + "").add(y + " " + c);
			}
			if (map.containsKey(y)) {
				map.get(y + "").add(x + " " + c);
			} else {
				map.put(y + "", new HashSet<String>());
				map.get(y + "").add(x + " " + c);
			}
		}
		int k = s.nextInt();
		for (int i = 0; i < k; i++) {

			int z = s.nextInt();
			int p = s.nextInt();
			arr.add(z + " " + p);

		}
		int d = s.nextInt();
		//System.out.println(arr.size());
		counter = Integer.MAX_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			String[] parts = arr.get(i).split(" ");
			int start = Integer.parseInt(parts[0]);
			int price = Integer.parseInt(parts[1]);
			run(map, new HashSet<String>(), start, d, price);
			//System.out.println(arr.get(i));
		}

		System.out.println(counter);

	}

	public static void run(HashMap<String, HashSet<String>> map, HashSet<String> set, int s, int d, int cost) {

		if (s == d) {
			if (counter > cost) {
				counter = cost;
			}
			//System.out.println(s + " " + cost);
			return;
		} else {
			//System.out.println(s + " " + map.get(s));
			for (String str : map.get(s+"")) {
				//System.out.println(str);
				if (str != null || str.equals(null)) {
					String[] parts = str.split(" ");
					int start = Integer.parseInt(parts[0]);
					int price = Integer.parseInt(parts[1]);
					//if (set.contains(start)) {
						//System.out.println(str);
						cost += price;
						set.add(start + "");
						run(map, set, start, d, cost);
						set.remove(set.remove(start));
						cost -= price;
					//}
				}
			}

		}

	}

}
