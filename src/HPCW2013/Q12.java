package HPCW2013;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		
		String str = s.nextLine();
		str = str.replace(" ", "");
		String str2 = "";
		for(int i = 0; i < str.length();i++){
			str2 += morse[str.charAt(i) - 'A'];
		}
		System.out.println(str2);
		StringBuilder sb = new StringBuilder(str2);
		sb = sb.reverse();
		String str3 = sb.toString();
		System.out.println(str3);
		if(str2.equals(str3)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
