import java.util.Scanner;


public class HP_FruitMath_17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		char[] f = new char[t];
		char[][] r = new char[t][t];
		int ss[] = new int[t];
		
		for(int i = 0; i < t; i++){
			for(int ii = 0; ii < t; ii++){
			
				r[i][ii] = s.findWithinHorizon(".", 0).charAt(0);
				
			}	
			ss[i] = s.nextInt();
		}

	}

}
