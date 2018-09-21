import java.util.Scanner;


public class HP_Panagram_05_14 {

	public static void main(String[] args) {
	
		Boolean b = true;
		Boolean bb = true;
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int[] a =  new int[26];
		String rr = "";
	
		for(int i = 0; i < str.length(); i++){
			
			if((int)Character.toLowerCase(str.charAt(i)) <= 122 &&
					(int)Character.toLowerCase(str.charAt(i)) >= 97){
				
				a[Character.toLowerCase(str.charAt(i)) - 97]++;
				
			}
			
		}
		for(int i = 0; i < 26; i++){
			
			a[i]--;
			if(a[i] < 0){
				b = false;
			}
			
		}
		if(b){
			for(int i = 0; i < 26; i++){
				if(a[i] > 0){
					bb = false;
					break;
				}
			}
			if(bb){
				rr = "Perfect";
			}else{
				rr = "Pangram";
			}
			
		}else{
			rr = "Neither";
		}
		
		System.out.println(rr + ": " + str);
	

	}

}
