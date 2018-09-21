import java.util.Scanner;

public class Valid_Palinndrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String p = s.nextLine();
		Boolean b = true;
		int  y = 0;
		
			if(p.contains(","))
			{
			    String ss[] = p.split("\\,");
			    p = ss[0] + ss[1];
			}
		
		
		for (int x = 0; x < p.length()-1; x++) {
			
			
			
				if (p.charAt(x) != p.charAt(p.length()- 1 - x)) {
					
					b = false;
					break;
				}
			

		}
		
		System.out.println(b);
	}

}
