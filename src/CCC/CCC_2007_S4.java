package CCC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CCC_2007_S4 {

	public static int counter = 0;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//use for graph;		
		String x = s.next(), y = s.next();
		HashMap<String, HashSet<String>> hash = new HashMap<>();

		while (!x.equals(0 + "") && !y.equals(0 + "")) {
			if (hash.get(x) == null) {
				hash.put(x, new HashSet<String>());
			}
		
			hash.get(x).add(y);
			x = s.next();
			y = s.next();
		}
		
//slow backtracking
		HashSet<String> set = new HashSet<>();
		set.add(1 + "");
		
		bt(1, n, hash, set);
		System.out.println(counter);
	}

	public static void bt(int p, int d, HashMap<String, HashSet<String>> hash,
			HashSet<String> set) {

		if (p == d) {
			counter++;
			
			return;
		} else {

			for (String it : hash.keySet()) {

				if (set.contains(it)) {

				} else {
					for (String item : hash.get(it)) {

						if (!set.contains(item)) {

							set.add(item);

							bt(Integer.parseInt(item), d, hash, set);

							set.remove(item);
						}

					}
				}
			}

		}

	}
	
	public static int graph(){
		return counter;
		
	}
	


}
