package CCC;
import java.util.Scanner;


public class CCC_2012_J4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		String cd = s.next();
		String str = "";
		char c = ' ';
		
		for(int i = 0; i < cd.length(); i++){
			
			c = (char)((int)cd.charAt(i) - (3*(i+1)+k));
			while((int)c < 'A'){
				c += 26;
			}
			str += c;
		}
		System.out.println(str);
	}

}