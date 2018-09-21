package CCC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class CCC_2013_J4 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int nc = s.nextInt();
		int n = 0;
		int k = 0;
		//Regular Array
		/*int[] arr = new int[nc];
		for(int i = 0; i < nc; i++){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		do{
				
				t -= arr[k];
				if(t < 0){
					t += arr[k];
					break;
				}
				n++;
				k++;
			
		}while(t > 0);
		System.out.println(n);*/
		//ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < nc; i++){
			arr.add(s.nextInt());
		}
		Collections.sort(arr);
		do{
			
			t -= arr.get(k);
			if(t < 0){
				t += arr.get(k);
				break;
			}
			n++;
			k++;
		
		}while(t > 0);
		System.out.println(n);
		}
	
}
