package CCC_2015;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str2 = "";
		int[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < str.length(); i++) {
			str2 += str.charAt(i);
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				
			}else{
				int c = Integer.MAX_VALUE;
				int index = 0;
				for(int j = 0; j < 5; j++){
					if(Math.abs(str.charAt(i) - vowels[j]) < c){
						c = Math.abs(str.charAt(i) - vowels[j]);
						index = j;
					}
				}
				str2 += (char)(vowels[index]);
				
				if(str.charAt(i) == 'z'){
					str2 += 'z';
				}else{
					char cc = (char) (str.charAt(i) + 1);
					while(cc == 'a' || cc == 'e' || cc  == 'i' || str.charAt(i) == 'o'
					|| cc == 'u'){
						cc++;
					}
					str2 += (char)cc;
				}
			}

		}
		System.out.println(str2);

	}

}
