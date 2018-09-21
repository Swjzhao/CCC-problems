package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2015_S2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int j = s.nextInt();
		int a = s.nextInt();
		int[] jers = new int[j];
		int[] ath = new int[a];
		int[] aths = new int[a];
		
		for(int i = 0; i < j; i++){
			String str = s.next();
			switch(str){
			case "S" : jers[i] = 1;break;
			case "M" : jers[i] = 2;break;
			case "L" : jers[i] = 3;break;
			}
						
					
		}
		
		for(int i = 0 ; i < a; i++){
			String str = s.next();
			int k = s.nextInt();
			ath[i] = k;
			switch(str){
			case "S" : aths[i] = 1;break;
			case "M" : aths[i] = 2;break;
			case "L" : aths[i] = 3;break;
			}
			
		}
		ArrayList<Integer> arr = null;
		for(int i = 0; i < j; i++){
			boolean tr = true;
			for(int t = 0; t < a; t++){
				if(ath[t] == i)tr = false;
			}
			if(!tr){
			
				arr = new ArrayList<>();
				for(int k = 0; k <ath.length; k++){
					
					if(ath[k] == i){
						if(aths[k] <= jers[i]){
						arr.add(k);
						break;
						}
					}else{
						
					}
				}
			
			}
		}
		System.out.println(arr.size());

	}

}
