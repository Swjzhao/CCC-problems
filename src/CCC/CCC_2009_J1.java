package CCC;
import java.util.Scanner;


public class CCC_2009_J1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = "9780921418";
		String ex = "";
		int t = 0;
		System.out.println("Digit 11?");
		n += s.next();
		System.out.println("Digit 12?");
		n += s.next();
		System.out.println("Digit 13?");
		n += s.next();
		
		for(int i = 0; i < n.length(); i++){
			
			if(i%2 == 0){
				t += Integer.parseInt(n.charAt(i)+"")*1;
				
			}else{
				t += Integer.parseInt(n.charAt(i)+"")*3;
				
			}
			
			
		}
		System.out.println(t);	
	}
	

}
