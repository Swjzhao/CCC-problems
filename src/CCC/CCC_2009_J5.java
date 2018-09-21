package CCC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class CCC_2009_J5 {

	public static int minStep = Integer.MAX_VALUE;
	
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		HashSet<String> connection = new HashSet<>();
		HashMap<String, HashSet<String>> graph = new HashMap<String, HashSet<String>>(); 
		Scanner scan = new Scanner(System.in);
		
		graph.put("1", new HashSet<String>());
		graph.put("2", new HashSet<String>());
		graph.put("3", new HashSet<String>());
		graph.put("4", new HashSet<String>());
		graph.put("5", new HashSet<String>());
		graph.put("6", new HashSet<String>());
		graph.put("7", new HashSet<String>());
		graph.put("8", new HashSet<String>());
		graph.put("9", new HashSet<String>());
		graph.put("10", new HashSet<String>());
		graph.put("11", new HashSet<String>());
		graph.put("12", new HashSet<String>());
		graph.put("13", new HashSet<String>());
		graph.put("14", new HashSet<String>());
		graph.put("15", new HashSet<String>());
		graph.put("16", new HashSet<String>());
		graph.put("17", new HashSet<String>());
		graph.put("18", new HashSet<String>());
		
		graph.get("1").add("6");
		graph.get("2").add("6");
		graph.get("3").add("4");
		graph.get("3").add("5");
		graph.get("3").add("6");
		graph.get("3").add("15");
		graph.get("4").add("3");
		graph.get("4").add("4");
		graph.get("4").add("5");
		graph.get("5").add("3");
		graph.get("5").add("4");
		graph.get("5").add("5");
		graph.get("6").add("1");
		graph.get("6").add("2");
		graph.get("6").add("3");
		graph.get("6").add("4");
		graph.get("6").add("5");
		graph.get("6").add("7");
		graph.get("7").add("6");
		graph.get("7").add("8");
		graph.get("8").add("7");
		graph.get("8").add("9");
		graph.get("9").add("8");
		graph.get("9").add("10");
		graph.get("9").add("12");
		graph.get("10").add("9");
		graph.get("10").add("11");
		graph.get("11").add("10");
		graph.get("11").add("12");
		graph.get("12").add("9");
		graph.get("12").add("11");
		graph.get("12").add("13");
		graph.get("13").add("12");
		graph.get("13").add("14");
		graph.get("13").add("15");
		graph.get("14").add("13");
		graph.get("15").add("3");
		graph.get("15").add("13");
		graph.get("16").add("17");
		graph.get("16").add("18");
		graph.get("17").add("16");
		graph.get("17").add("18");
		graph.get("18").add("16");
		graph.get("18").add("17");
		
		String f = scan.next();
		String s = "";
		String t = "";
		while(!f.equals("q")){
			
			if(f.equals("i")){
				//System.out.println("i");
				s = scan.next();
				t = scan.next();
				if(graph.get(s) == null){
				graph.put(s, new HashSet<String>());
				}
				
				
				graph.get(s).add(t);
				graph.get(t).add(s);
				
			}else if(f.equals("d")){
				
				s = scan.next();
				t = scan.next();
				graph.get(s).remove(t);
				
					graph.get(t).remove(s);
				
				
			}else if(f.equals("n")){
				
				s = scan.next();
				System.out.println(graph.get(s).size());
				
			}else if(f.equals("f")){
				s = scan.next();
				int counter = 0;
				HashSet<String> teemo = new HashSet<>();
				for(String item : graph.get(s)){
					//System.out.print(item + ":");
					for(String item2: graph.get(item)){
						teemo.add(item2);
						//System.out.print(item2+ " ");
					}
				}
				for(String item: graph.get(s)){
					teemo.remove(item);
				}
				teemo.remove("20");
				System.out.println(teemo.size());
				
			}else{
				
				s = scan.next();
				t = scan.next();
				minStep = bfs(graph,s,t);
				if(minStep == Integer.MAX_VALUE){
					System.out.println("Not Connected");
				}else{
					System.out.println(minStep);
				}
			}
			f = scan.next();
				
			
		}
	
		
	}
	
	public static void r(HashMap<String,HashSet<String>> graph, String s, String t, int e){
		
		if(e > 5){
			return;
		}
		
		if(s.equals(t)){
			if(minStep > e){
				
				minStep = e;
			}
			
			return;
		}else{
			
			for(String item : graph.get(s)){
				e++;
				r(graph,item,t,e);
				e--;
			}
			
		}
		
		
	}
	
	public static int bfs(HashMap<String, HashSet<String>> graph, String s, String t){
		
		HashSet<String> level = new HashSet<>();
		HashSet<String> visited= new HashSet<>();
		level.add(s);
		
		int e = 0;
		while(!level.isEmpty()){
			if(level.contains(t)){
				return e;
			}
			for(String str: level){
				visited.add(str);
			}
			HashSet<String> next = new HashSet<String>();
			for(String str: level){
				HashSet<String> f = graph.get(str);
				
				for(String str2 : f){
					
					if(!next.contains(str2) && !visited.contains(str2))
					{
					
						next.add(str2);
					}
				}
			}level = next; e++;
			
		}
		return -1;
		
		
		
	}
}