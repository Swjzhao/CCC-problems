import java.util.Scanner;


public class LongestPalindromicSubString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
		int[] h = new int[string.length()];
		h[0] = 1;
		int z = -1;
		int y1 =0, y2 = 0;
		boolean b = false;
		
		if(string.length() == 1){
			
			System.out.println(1);
		}else{
			
			for(int x = 1; x <string.length() ; x++){
					
				if(string.charAt(x) == string.charAt(x-1)){
					
					for(int xx = 1; xx <string.length()-x ;xx++){
						
						
						
						if(string.charAt(x+xx+y1) == string.charAt(x-xx+y2)){
							h[x] += 2;
							
						}else{
							
							xx += string.length();
							
							
						}
					
				}
				h[x] += Math.abs(y1) + Math.abs(y2);
			
			y1 = 0;
			y2 = 0;
					
				}else{
					
				
				
				
					
					for(int xx = 1; xx <string.length()-x ;xx++){
						
						
						
							if(string.charAt(x+xx+y1) == string.charAt(x-xx+y2)){
								h[x] += 2;
								
							}else{
								
								xx += string.length();
								
								
							}
						
					}
					h[x] += Math.abs(y1) + Math.abs(y2);
				
				y1 = 0;
				y2 = 0;
				}
				
			}
			//abbcqdqcbcfq
			
			for(int x = 0; x < h.length; x++){
				if(z < h[x]){
					z = h[x];
					
				}
			}
			
				System.out.println(z+1);
		}


	}

}
