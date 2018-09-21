package CCC;

import java.util.Scanner;

public class CCC_2010_S2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] alpha = new String[52];
		int n = s.nextInt();
		for(int i = 0 ; i< n; i++){
			alpha[s.next().charAt(0) - 'A'] = s.next();
		}
//		for(int i = 0; i < 52; i++){
//			char c = (char)(i+'A');
//			if(c > 'Z'){
//				c += 'a' - 'Z' - 1;
//			}
//			System.out.print(c + " " + alpha[i]);
//			System.out.println("");
//			
//		}
		String str = s.next();
		int ind = 0;
		String str2 = "";
		String str3 = "";
		for(int i = 0; i < str.length()+1; i++){
			str2 = str.substring(ind, i);
			for(int j = 0; j < 52; j++){
				if(str2.equals(alpha[j])){
					ind  = i;
					char c = (char)(j+'A');
					if(c > 'Z'){
						c += 'a' - 'Z' - 1;
					} 
					str3 += c;
					break;
				}
			}
		}
		System.out.println(str3);
	}

}
