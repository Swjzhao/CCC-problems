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

	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		Vertex[] pen = new Vertex[n];
		HashMap<Point, Edge> key = new HashMap<>();
		for(int i = 0; i < n ; i++){
			pen[i] = new Vertex(i);
		}
		
		for (int i = 0; i < n; i++) {
			int e = s.nextInt();
			int[] points = new int[e];
			for (int j = 0; j < e; j++) {
				int u;
				if (j == e - 1) {
					u = 0;
				} else {
					u = j + 1;
				}
				if (key.containsKey(new Point(points[j], points[u]))) {

				} else if (key.containsKey(new Point(points[j], points[u]))) {

				} else {

				}
			}

		}

	}

}
