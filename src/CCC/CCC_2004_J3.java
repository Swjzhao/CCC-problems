package CCC;
import java.util.ArrayList;
import java.util.Scanner;


public class CCC_2004_J3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int ft = s.nextInt();
		int st = s.nextInt();
		int n = 0;
		ArrayList<String> fa = new ArrayList<>();
		ArrayList<String> sa = new ArrayList<>();
		
		for(int i = 0; i < ft; i++){
			fa.add(s.next());
		}
		for(int i = 0; i < st; i++){
			sa.add(s.next());
		}
		for(int i = 0; i < ft;i++){
			for(int x = 0; x < st; x++){
				
				System.out.println(fa.get(i) + " as " + sa.get(x));
				
			}
			
			
		}

	}

}
