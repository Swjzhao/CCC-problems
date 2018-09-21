package CCC;

import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CCC_2010_J5 {

	public static int step = Integer.MAX_VALUE;
	public static int a = 0;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int x1 = s.nextInt() - 1; //
		int y1 = s.nextInt() - 1;

		int x2 = s.nextInt() - 1;
		int y2 = s.nextInt() - 1;

		HashSet<String> visited = new HashSet<>();
		HashSet<String> level = new HashSet<>();
		HashMap<String, HashSet<String>> map = new HashMap<>();
		
		createGraph(map, x1, y1, x2, y2);
		//System.out.println(map.get("10"));
		System.out.println(run(map, visited, level, x1, y1, x2, y2));

	}

	public static void createGraph(HashMap<String, HashSet<String>> map, int x1, int y1, int x2, int y2) {
		
		HashSet<Point> gpoints = new HashSet<Point>();
		gpoints.add(new Point(1, 2));
		gpoints.add(new Point(2, 1));
		gpoints.add(new Point(-1, 2));
		gpoints.add(new Point(-2, 1));
		gpoints.add(new Point(1, -2));
		gpoints.add(new Point(2, -1));
		gpoints.add(new Point(-1, -2));
		gpoints.add(new Point(-2, -1));
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				HashSet<String> points = new HashSet<>();
				for (Point p : gpoints) {
					if(x + p.x < 8 && x + p.x >= 0 && y + p.y < 8 && y + p.y >= 0)
					points.add((x + p.x) +""+ (y + p.y));
				}
				map.put(x+""+y, points);
			}
		}
		

	}

	public static int run(HashMap<String, HashSet<String>> map, HashSet<String> visited, HashSet<String> level, int x,
			int y, int x2, int y2) {

		int min = 0;

		level.add(x + "" + y);
		visited.add(x + "" + y);
		while (!level.isEmpty()) {
			if (level.contains(x2 + "" + y2)) {
				return min;
			}
			for(String s : level){
				visited.add(s);
				//System.out.println(s);
				//System.out.println(map.get(s));
			}
			min++;
			
			HashSet<String> next = new HashSet<String>();
			for(String s: level){
				HashSet<String> f = map.get(s);
				
				for(String t : f){
					//System.out.println(t);
					if(!next.contains(t) && !visited.contains(t))
					{
						//System.out.println(t);
						next.add(t);
					}
				}
			}level = next;
			
			//System.out.println(level.isEmpty());
		}
		return -1;

	}
}
