package CCC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

class Vertex1 implements Comparable<Vertex1> {

	public int id;
	public HashSet<Edge1> edges = new HashSet<>();
	public int minprice;
	public int price;
	public Vertex1 from;

	public Vertex1(int id) {
		this.id = id;
		minprice = Integer.MAX_VALUE;
		price = 0;
	}

	public int compareTo(Vertex1 v) {

		return Integer.compare(minprice, v.minprice);
	}

}

class Edge1 implements Comparable<Edge1> {
	public Vertex1 to;
	public int weight;

	public Edge1(Vertex1 v, int weight) {
		to = v;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge1 e) {
		return Integer.compare(weight, e.weight);

	}

}

public class CCC_2009_S4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = s.nextInt();
		Vertex1[] vex = new Vertex1[n + 2];
		Vertex1[] vex1 = new Vertex1[n + 2];
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i <= n + 1; i++) {
			vex[i] = new Vertex1(i);

		}
		for (int i = 0; i < t; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			int c = s.nextInt();
			Edge1 e1 = new Edge1(vex[x], c);
			vex[y].edges.add(e1);
			Edge1 e2 = new Edge1(vex[y], c);
			vex[x].edges.add(e2);
			//System.out.println(x + " " + y + " " + c);
		}
		int k = s.nextInt();
		//System.out.println(k);
		for (int i = 0; i < k; i++) {
			int v = s.nextInt();
			int p = s.nextInt();
			vex[v].price = p;
			//System.out.println(v + " " + p);
		}
		int d = s.nextInt();
		int start = d;

		for (Vertex1 vv : vex) {
			if (!vv.edges.isEmpty() && vv.price != 0) {
				dij(vv, d, arr);
			}
			for (Vertex1 vvv : vex)
				vvv.minprice = Integer.MAX_VALUE;

		}

		Collections.sort(arr);
		int total = 0;
		int in = 0;
		do {

			total = arr.get(in);
			in++;
		} while (total == 0);

		System.out.println(total);

	}

	public static void dij(Vertex1 v, int d, ArrayList<Integer> arr) {

		PriorityQueue<Vertex1> vq = new PriorityQueue<>();
		// System.out.println(v.id);
		v.minprice = 0;
		vq.add(v);
		int min = 0;

		while (!vq.isEmpty()) {
			Vertex1 u = vq.poll();
			if (u.id == d) {
				min = u.minprice;
				if (min == 0) {

					// System.out.println(u.id + " " + v.id);
					min = v.price;
				}
				if (min == 213) {
					// System.out.println(v.id);
				}
				arr.add(min);
				return;
			}
			for (Edge1 e : u.edges) {
				if (e.weight == 0 || u.price == 0) {
					continue;
				} else {
					Vertex1 vv = e.to;
					int weight = u.price + e.weight;

					if (weight < vv.minprice && weight > 0) {
						// System.out.println(1);
						vq.remove(vv);
						vv.minprice = weight;
						// vv.from = u;
						vq.add(vv);
					}
				}
			}
		}

	}

}
