package CCC;
import java.util.Scanner;


public class CCC_1998_A {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] str = new String[n];
		s.nextLine();
		for(int i = 0; i < n; i++){
			str[i] = s.nextLine();
		}
		String[] p;
		StringBuilder sb;
		for(int i = 0; i < n; i++){
			p = str[i].split("\\s|,+");
			sb = new StringBuilder(str[i]);
			for(int x = 0; x < p.length; x++){
				if(p[x].length() == 4){
					sb.replace(sb.indexOf(p[x]), sb.indexOf(p[x])+p[x].length(), "****");
				}
			}
			str[i] = sb.toString();
			System.out.println(str[i]);
		}
		
		
	}

}
