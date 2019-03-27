package CCC;

import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
//class Edge implements Comparable<Edge> {
//
//	public int cost;
//	public Vertex to;
//	public Vertex from;
//	public int id;
//
//	private int n = 0;
//
//	public Edge(int cost) {
//
//		this.cost = cost;
//		id = n++;
//
//	}
//
//	@Override
//	public int compareTo(Edge e) {
//		return cost - e.cost;
//	}
//
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Edge other = (Edge) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//
//}
//
//class Vertex {
//
//	public int id;
//	public HashSet<Edge> edges = new HashSet<>();
//	
//	public Vertex(int id) {
//		this.id = id;
//	}
//
//	public Vertex addEdge(Edge e) {
//		edges.add(e);
//		return this;
//	}
//
//}
public class CCC_2010_S4 {

	import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		Scanner scanner = new Scanner(System.in);
		int penNum = scanner.nextInt();

		Vertex[] pens = new Vertex[penNum];

		HashMap<Point, Edge> key = new HashMap<Point, Edge>();
		for (int i = 0; i < penNum; i++)
			pens[i] = new Vertex(i);
		for (int i = 0; i < penNum; i++) {
			int edges = scanner.nextInt();
			int[] points = new int[edges];
			for (int j = 0; j < edges; j++) {
				points[j] = scanner.nextInt();
			}
			for (int j = 0; j < edges; j++) {
				int u;
				if (j == edges - 1)
					u = 0;
				else
					u = j + 1;
				if (key.containsKey(new Point(points[j], points[u]))
						|| key.containsKey(new Point(points[u], points[j]))) {
					Edge e = key.containsKey(new Point(points[j], points[u]))
							? key.remove(new Point(points[j], points[u])) : key.remove(new Point(points[u], points[j]));
					e.to = pens[i];
					Edge e2 = new Edge(scanner.nextInt());
					e2.to = e.from;
					e2.from = pens[i];
					pens[i].addEdge(e2);
				} else {
					Edge e = new Edge(scanner.nextInt());
					e.from = pens[i];
					key.put(new Point(points[j], points[u]), e);
					pens[i].addEdge(e);
				}
			}
		}
		Vertex outside = new Vertex(-1);
		Iterator<Edge> i = key.values().iterator();
		while (i.hasNext()) {
			Edge e = i.next();
			e.to = outside;
			Edge e2 = new Edge(e.cost);
			e2.from = outside;
			e2.to = e.from;
			outside.addEdge(e2);
		}
		System.out.println(prim(pens[0], penNum + 1, outside));
		scanner.close();
	}

	public int prim(Vertex origin, int count, Vertex outside) {
		//http://algs4.cs.princeton.edu/43mst/
		int cost = 0;
		int outsideCount = 0;
		int outsideVal = 0;
		PriorityQueue<Edge> next = new PriorityQueue<Edge>();
		HashSet<Vertex> visited = new HashSet<Vertex>();
		next.addAll(origin.edges);
		visited.add(origin);
		while (true) {
			if (visited.size() == count)
				break;
			Edge e = next.poll();
			if (visited.contains(e.to))
				continue;
			else {
				next.addAll(e.to.edges);	// automatically sorted
				visited.add(e.to);// you can also save the edge e to the result
				cost += e.cost;
				if (e.from == outside || e.to == outside) {
					outsideCount++;
					if (outsideVal == 0)
						outsideVal = e.cost;
				}
			}
		}
		if (outsideCount > 1)
			return cost;
		else
			return cost - outsideVal;
	}
}


}
