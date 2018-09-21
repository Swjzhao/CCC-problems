package CCC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CCC_2000_S3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		HashMap<String, HashSet<String>> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
 		s.nextLine();
		String str = s.nextLine();
		String url = "";
		while (!str.equals("The End")) {
			//System.out.println(str);
			if (str.contains("<HTML>")) {
				String str2 = str;
				// System.out.println(str2);
				while (!str2.endsWith("</HTML>")) {
					int index3 = 0;
					int i = 0;
					while (str2.substring(index3).contains("http://")) {

						int index = str2.substring(index3).indexOf("http://") + index3;
						int index2 = str2.indexOf("\"", index);

						String str3 = str2.substring(index, index2);

						map.get(url).add(str3);
						
						arr2.add(str3);
						//System.out.println(url + " " + str3);
						
						index3 = index2;
						i++;

					}

					str2 = s.nextLine();

				}
			} else {
				url = str;
				if(!arr.contains(url)){
				arr.add(url);
				}
				if(map.containsKey(url)){
					
				}else{
				map.put(url, new HashSet<>());
				}
				//System.out.println(url);
			}
			str = s.nextLine();
		}

		for (String strt : arr) {
				
				 for(String str1: map.get(strt)){
				 System.out.println("Link from " + strt.toString() + " to " +
				 str1);
				 }
			
		}
		
		for(int i = 0; i < arr.size(); i++){
			for(int j = i+2; j < arr.size(); j++){
				
				boolean b = run(map, arr.get(i), arr.get(j), 0);
				if(b){
					System.out.println("Can surf from " + arr.get(i) + " to " + arr.get(j));
				}else{
					System.out.println("Cant surf from " + arr.get(i) );
				}
				
			}
			
		}
		for(int i = 0; i < arr2.size(); i++){
			if(arr.contains(arr2.get(i))){
				arr2.remove(i);
				i--;
			}
		}
		for(int i = 0; i < arr.size(); i++){
			for(int j = 0; j < arr2.size(); j++){
				//System.out.println(arr.get(i) + " " + arr2.get(j));
				boolean b = run(map, arr.get(i), arr2.get(j), 0);
				if(b){
				
				}else{
					System.out.println("Cant surf from " + arr2.get(j) + " to " + arr.get(i) );
				}
				
			}
			
		}

	}
	public static boolean run(HashMap<String, HashSet<String>> map , String p, String q, int i){
		
		HashSet<String> level = new HashSet<>();
		level.add(p);
		while(!level.isEmpty()){
			
			if(level.contains(q)){
				return true;
			}
			
			HashSet<String> next = new HashSet<>();
			
			for(String s: level){
				if(map.get(s) == null){
					
				}
				for(String t: map.get(s)){
					
					if(!next.contains(t)){
						next.add(t);
					}
				}
				
			}
			level = next;
			
			i++;
		}
		return false;
		
	}

}
