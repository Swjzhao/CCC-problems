package CCC_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class J4 {
 // not finished
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> last = new ArrayList<Integer>();
		ArrayList<Integer> time = new ArrayList<Integer>();
		int t = 0;
		for(int i = 0; i < m; i++){
			String str = s.next(); int n = s.nextInt();
			
			if(str.equals("R")){
				if(arr.contains(n)){
					last.set(arr.indexOf(n), i);
				}else{
					arr.add(n);
					last.add(i);
					time.add(0);
				}
			}else if(str.equals("S")){
				time.set(arr.indexOf(n), time.get(arr.indexOf(n)) + t - last.get(arr.indexOf(n)));
			}else{
				t += n-2;
			}
			//System.out.println(t);
			t++;
		}
		for(int i = 0; i < arr.size(); i++){
			if(time.get(i) == 0){
				time.set(i, -1);
			}
		}
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i) + " " + time.get(i));
		}
	}

}
