import java.util.Scanner;


public class PerfectNum {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int pp = 0;
		for(int x = 1; x <= Math.sqrt(p) ; x++){
			pp++;
		}
		System.out.println(pp);
	}
	
}
