import java.util.Scanner;


public class Week_Temperature {

	public static void main(String[] args) {
		
		int[] temperature = new int[7];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < temperature.length; i++){
			
			temperature[i] = s.nextInt();
			
		}
		for(int i = 0; i < temperature.length; i++){
			
			System.out.print(temperature[i] + " ");
		
		}
			System.out.println("");
			System.out.println(temperature.length);

	}

}
