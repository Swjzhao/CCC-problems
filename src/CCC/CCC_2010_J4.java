package CCC;
import java.util.ArrayList;
import java.util.Scanner;


public class CCC_2010_J4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr;
		int length = 0;
		
		while(n != 0){
			
			arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = s.nextInt();
			}
			length = getLength(arr);
			System.out.println(length);
			n = s.nextInt();
		}
		

	}
	
	public static int getLength(int[] arr){
		
		ArrayList<String> sa = new ArrayList<>();
		int l = 0;
		for(int i = 1; i < arr.length; i++){
			
			
		
			if(sa.contains(arr[i]-arr[i-1] + "")){
				break;
			}else {
				sa.add(arr[i]-arr[i-1] + "");
			}
			l++;
		}
		
		return l;
	}

}
