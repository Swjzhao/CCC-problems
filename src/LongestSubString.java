import java.util.Scanner;


public class LongestSubString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
		int[] h = new int[string.length()];
		h[0] = 1;
		int z = -1;
		
		for(int x = 1; x <string.length() ; x++){
			
			if(string.charAt(x) > string.charAt(x-1)){
				h[x] = h[x-1] + 1;
				
			}else{
				h[x] = 1;
				
				
			}
			
		}
		
		for(int x = 0; x < h.length; x++){
			if(z < h[x]){
				z = h[x];
				
			}
		}
		
		System.out.println(z);

	}

}
