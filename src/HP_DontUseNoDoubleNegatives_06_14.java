import java.util.Scanner;


public class HP_DontUseNoDoubleNegatives_06_14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.toUpperCase().substring(i).startsWith("DON’T") ||
			str.toUpperCase().substring(i).startsWith("CAN'T") ||
			str.toUpperCase().substring(i).startsWith("ISN’T") ||
			str.toUpperCase().substring(i).startsWith("HAVEN’T") ||
			str.toUpperCase().substring(i).startsWith("CANNOT") ||
			str.toUpperCase().substring(i).startsWith("WOULDN’T") ||
			str.toUpperCase().substring(i).startsWith("COULDN’T") ||
			str.toUpperCase().substring(i).startsWith("WON’T") ||
			str.toUpperCase().substring(i).startsWith("NO") ||
			str.toUpperCase().substring(i).startsWith("NOT") ||
			str.toUpperCase().substring(i).startsWith("NEVER") ||
			str.toUpperCase().substring(i).startsWith("NOBODY") ||
			str.toUpperCase().substring(i).startsWith("NOWHERE") ||
			str.toUpperCase().substring(i).startsWith("NEITHER") ||
			str.toUpperCase().substring(i).startsWith("AIN'T") 	){
				
				n++;
				
			}
		}
		System.out.println(n);
	}

}
