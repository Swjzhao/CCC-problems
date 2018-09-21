import java.util.Scanner;


public class HP_BeeMath_01_14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		System.out.println(t + " " + Math.round(100 * Math.sqrt(t) + 201/(t+1) + 1));

	}

}
