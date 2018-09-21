import java.util.Scanner;


public class One_D_Array {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int n = input.nextInt();
		
		int[] t = new int[n];
		
		for(int i = 0; i < t.length; i++){
		
			System.out.println("Enter " + i + " number: ");
			t[i] = input.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < t.length; i++){
			System.out.println("The " + i + " number is: " + t[i]);
		}
			

	}

}
