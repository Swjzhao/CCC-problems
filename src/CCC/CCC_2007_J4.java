package CCC;
import java.util.Scanner;


public class CCC_2007_J4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		boolean isAn = true;
		
		int[] arr= new int[256];
		
		for(int i = 0; i < s1.length();i++){
			if(s1.charAt(i) != ' '){
				arr[s1.charAt(i)]++;
			}
		}
		for(int i = 0; i < s2.length();i++){
			if(s2.charAt(i) != ' '){
				arr[s2.charAt(i)]--;
			}
		}
		for(int i = 0; i < 256; i++){
			if(arr[i] > 0){
				isAn = false;
			}
		}
		if(isAn){
			System.out.println("Is anagram");
		}else{
			System.out.println("Is not");
		}

	}

}
