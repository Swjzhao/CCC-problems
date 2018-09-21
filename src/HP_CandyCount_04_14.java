import java.util.ArrayList;
import java.util.Scanner;


public class HP_CandyCount_04_14 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n = s.nextInt();
		
		int np = s.nextInt();
		int[] an = new int[np];

		String[] str = new String[np];
		String[] rr = new String[np];
		int z = 0;
		for(int i = 0; i < np; i++){
		
			an[i] = s.nextInt(); 
			str[i] = s.next();
		
		}
		int cg = n;
		String a = "";
		for(int i = 1; i < np; i++){
			if( (Math.abs(n - an[i])) < cg){
				cg = n-an[i];
				a = str[i];
			}else if(Math.abs(n - an[i]) == cg){
			 rr[z] = str[i];
					 z++;
			}
			
		}
		for(int i = 0; i < np; i++){
			
			if(rr[i] != null){
				a += " " + rr[i];
			}
			
		}
		System.out.println(a);

	}

}
