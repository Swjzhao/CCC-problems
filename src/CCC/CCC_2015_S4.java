package CCC;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

class Vertex implements Comparable<Vertex>{
	
	public int id;
	public HashSet<Edge> edges = new HashSet<>();
	public Vertex from;
	public int hull = 0;
	public int mintime = Integer.MAX_VALUE;
	public int time = 0;
	
	public Vertex(int id) {
		this.id = id;
	}

	
	@Override
	public int compareTo(Vertex v) {
		
		return Integer.compare(mintime, v.mintime);
	}
	
	

}

class Edge{
	
	public Vertex to;
	public int weight;
	public int time = 0;
	public Edge(Vertex v, int weight,int time){
		to = v;
		this.weight = weight;
		this.time = time;
	}
	

}



public class CCC_2015_S4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int k = s.nextInt();
		int n = s.nextInt();
		int m = s.nextInt();
		Vertex[] vex = new Vertex[n+1];
		for(int i = 0; i < n+1; i++){
			vex[i] = new Vertex(i);
		}
		
		for(int i = 0; i < m ; i++){
			HashSet<Edge> hs  = new HashSet<>();
			int a = s.nextInt(), b = s.nextInt();
			int t = s.nextInt(), h = s.nextInt();
			
			Edge e1 = new Edge(vex[b], h, t);
			
			vex[a].edges.add(e1);
			
			Edge e2 = new Edge(vex[a], h, t);
			
			vex[b].edges.add(e2);
			
		}
		
		int start = s.nextInt(), end = s.nextInt();
		PriorityQueue<Vertex> pq = new PriorityQueue<>();
		vex[start].mintime = 0;
		pq.add(vex[start]);
		int time = 0;
		int damage = 0;
		int mind = -1;
		while(!pq.isEmpty()){
			Vertex u = pq.poll();
			
			if(u.id == end){
				mind = u.mintime;
				break;
			}
			for(Edge e: u.edges){
				
				Vertex v = e.to;
				int weight = e.weight;
				damage = u.hull + weight;
				int temp = v.mintime;
				time = u.mintime + e.time;
				if(damage < k && time < v.mintime){
					
					pq.remove(v);
					
					v.hull = damage;
					v.mintime = time;
					v.from = u;
					
					pq.add(v);
					
				}
				
				
			}
			
		}
		
		for(Vertex v : vex)
			if(v != null)
			System.out.println(v.id + " " +  v.mintime);
		
		System.out.println(mind);
		

	}

}
