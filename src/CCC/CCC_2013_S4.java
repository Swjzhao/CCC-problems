package CCC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CCC_2013_S4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		for(int i = 0; i < n+1; i++){
			map.put(i, new HashSet<Integer>());
		}
		for(int i = 0; i < m; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			
			map.get(a).add(b);
		
		}
		int p = s.nextInt();
		int q = s.nextInt();
		boolean b  = bfs(map,p,q);
		if(!b){
			b = bfs(map,q,p);
			if(!b)
				System.out.println("unknown");
			else
				System.out.println("no");
		}else{
			System.out.println("yes");
		}
		
		
	}
	
	public static boolean bfs(HashMap<Integer, HashSet<Integer>> map, int p, int q){
		
		HashSet<Integer> level = map.get(p);
		
		while(!level.isEmpty()){
			HashSet<Integer> next = new HashSet<>();
			if(!level.contains(q)){
				
				for(int i : level)
					if(map.get(i) == null)
						return false;
					else
						for(int j : map.get(i))
							if(!next.contains(j))
								next.add(j);
					
					
				
			}else{
				return true;
			}
			level = next;
		}
		return false;
		
		
		
	}

}
