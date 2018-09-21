package CCC;
import java.util.Scanner;


public class CCC_2004_J1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = Math.sqrt(s.nextDouble());
		int y = (int) (x + 0.5);
		System.out.println("The largest square has side length " + y);
	}

}
