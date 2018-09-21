package CCC;

import java.util.Scanner;

public class CCC_2004_J4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str2 = s.nextLine();
		
		String nstr = "";
		for(int i = 0; i < str2.length(); i++){
			if(str2.charAt(i) <= 'Z' && str2.charAt(i) >= 'A'){
				nstr += str2.charAt(i);
			}else{
				
			}
		}
		//System.out.println(nstr);
		str2 = "";
		for(int i = 0; i < nstr.length(); i++){
			char c = (char) (nstr.charAt(i) + (str.charAt(i%str.length()) -'A') ); 
			if(c > 'Z' ){
				c -= ('Z' - 'A' + 1);
			}
			str2 += c;
		}
		System.out.println(str2);
	
	}

}
