package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2015_S1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		boolean b = true;
		int t = 0;
		int k = 0;
		k = s.nextInt();
		for(int i = 0; i < k; i++){
			int n = s.nextInt();
			
			if(n != 0){
				arr.add(n);
			}else{
				arr.remove(t-1);
			}
			t = arr.size();
		}
		int sum = 0;
		for(int j = 0; j < arr.size(); j++){
			sum += arr.get(j);
		}
		System.out.println(sum);

	}

}
