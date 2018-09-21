package CCC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC_2007_J5 {

	public static int counter = 0;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(990);
		arr.add(1010);
		arr.add(1970);
		arr.add(2030);
		arr.add(2940);
		arr.add(3060);
		arr.add(3930);
		arr.add(4060);
		arr.add(4970);
		arr.add(5030);
		arr.add(5990);
		arr.add(6010);
		arr.add(7000);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int n = s.nextInt();
		for(int i = 0; i < n; i++){
			arr.add(s.nextInt());
		}
		Collections.sort(arr);
		r(a,b,0,arr);
		System.out.println(counter);
	}
	
	public static void r (int a, int b, int p, ArrayList<Integer> arr){
		
		if(p >= 7000){
			counter++;
			return;
		}else{
			
			//System.out.println(p);
			for(int i = 0; i < arr.size(); i++){
				if(p + b >= arr.get(i)&& p + a <= arr.get(i)){
					r(a,b,arr.get(i),arr);
				}
			}
			
			return;
		}
		
	}

}
