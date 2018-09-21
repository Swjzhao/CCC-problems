package CCC;
import java.util.Scanner;


public class CCC_2013_J3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String t = "";
		int index = Integer.parseInt(str);
	 	String c;
	 	int k = 0, j = 0;
	 	
	 	boolean b = true;
	 	boolean bl =true;
		
		for(int i = index+1; i < 10000; i++){
			
			str = i + "";
			b = true;
			for(int x = 0 ; x < str.length();x++){
				c = str.substring(x,x+1);
				t = "";
				for(int ix = 0; ix < str.length(); ix++){
					if(ix != x){
						t += str.charAt(ix);
					}
				}
				
				if(t.contains(c)){
					b = false;
					break;
				}
				
			}
			if(b){
				break;
			}
			
			
		}
		System.out.println(str);

	}

}
