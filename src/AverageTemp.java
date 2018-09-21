import java.util.Scanner;


public class AverageTemp {

	public static void main(String[] args) {
		
		int[] temperature = new int[7];
		double ss = 0.0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < temperature.length; i++){
			
			temperature[i] = s.nextInt();
			
		}
		for(int i = 0; i < temperature.length; i++){
			
			ss += temperature[i];
		
		}
		System.out.println(ss / temperature.length);
			

	}

}
