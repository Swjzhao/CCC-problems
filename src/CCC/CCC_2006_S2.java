package CCC;

import java.util.Scanner;

public class CCC_2006_S2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		String s3 = s.nextLine();
		
		char[] c = new char[27];
		for(int i = 0; i < 27; i++){
			c[i] = 'a';
		}
		for(int i = 0; i < s1.length(); i++){
			
			char cc = s1.charAt(i);
			char cc2 = s2.charAt(i);
			if(cc2 == ' '){
				c[0] = ' ';
			}else{
				c[cc2 - 'A' + 1] = cc;
			}
			
		}
		String str = "";
		for(int i = 0; i < s3.length(); i++){
			char cc = s3.charAt(i);
			
			if(cc == ' '){
				str += c[0];
			}else if(c[cc-'A'+1] == 'a'){
				str += ".";
			}else{
				str += c[cc-'A'+1];
			}
		}
		System.out.println(str);
	}

}
