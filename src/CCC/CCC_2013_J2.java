package CCC;
import java.util.Scanner;


public class CCC_2013_J2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean b = true;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != 'I' && str.charAt(i) != 'O' &&
				str.charAt(i) != 'S' && str.charAt(i) != 'H' &&
				str.charAt(i) != 'Z' && str.charAt(i) != 'X' &&
				str.charAt(i) != 'N'){
				
				b = false;
				break;
				
			}
		}
		if(b){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		

	}

}
