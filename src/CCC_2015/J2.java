package CCC_2015;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String[] parts = str.split(" ");
		str = "";
		for(String ss: parts){
			str += ss;
		}
		if(str.contains(":-)") || str.contains(":-(")){
			int h = 0,sa = 0;
			for(int i = 0; i < str.length(); i++){
				
				if(str.charAt(i) == ':' && i + 2< str.length()){
					if(str.charAt(i+1) == '-'){
						if(str.charAt(i+2) == '('){
							sa++;
							i+= 2;
						}else{
							h++;
							i+= 2;
						}
					}
				}
				
			}
			if(sa == h){
				System.out.println("unsure");
			}else if(sa > h){
				System.out.println("sad");
			}else{
				System.out.println("happy");
			}
		}else{
			
			System.out.println("none");
		}

	}

}
