package CCC;
import java.util.Scanner;


public class CCC_2011_J1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many antennas?");
		int a = s.nextInt();
		System.out.println("How many eyes?");
		int e = s.nextInt();
		if(a <= 2 && e <= 3){
			System.out.println("GraemeMercurian");
		}
		if(a >= 3 && e <= 4){
			System.out.println("TroyMartian");
		}
		if(a <= 6 && e >= 2){
			System.out.println("VladSaturnian");
		}
	}

}
