package CCC_2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J5 {

	static int counter = 0;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int p = s.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		r(n,n,p,"",arr);

		System.out.println(arr.size());
	}
	
	public static void r(int n,int c,int p,String str, ArrayList<String> arr){
		
		if(str.length()+1  == p){
			
			str += c;
			int[] in = new int[str.length()];
			for(int i = 0; i < str.length(); i++){
				in[i] = Integer.parseInt(str.charAt(i)+"");
			}
			Arrays.sort(in);
			str = "";
			for(int i : in){
				str += i;
			}
		
			if(arr.contains(str)){
				
			}else{
				arr.add(str);
			}
			
			return;
		}else{
			for(int i = 1; i < c;i++){
				r(n,c-i,p,str+=i, arr);
				str = str.substring(0,str.length()-1); 
			}
		}
		
	}

}
