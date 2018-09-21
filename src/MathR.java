import java.util.ArrayList;
import java.util.Scanner;

public class MathR {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//Multiply
		// int a = s.nextInt();
		// int b = s.nextInt();
		// int t = multiply(a,b);
		
		//Exponent
		double a = s.nextDouble();
		int b = s.nextInt();
		double t = power(a, b);

		System.out.println(t);
	}

	public static int multiply(int a, int b) {

		if (b == 0) {
			return 0;
		}

		return a + multiply(a, b - 1);

	}

	public static double power(double a, int b) {

		if (b == 0) {
			return 1;
		}

		return a * power(a, b - 1);

	}
}
