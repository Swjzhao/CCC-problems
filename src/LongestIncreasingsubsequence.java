import java.util.Scanner;


public class LongestIncreasingsubsequence {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
	
		int z = -1;
		int a = 0;
		int aa = 0;
		
		for(int x = 1; x <string.length() ; x++){
			if(a == 0){
				a = x-1;
			}
		
			if(string.charAt(x) > string.charAt(a)){
				
				aa++;
				a = x-1;
				
			}else{
				
				
		
				
			}
			
		}
		if(string.length() < 2){
			System.out.println(string.length());
		}else{
		
	
		System.out.println(aa + 1);
		}
	}
}
