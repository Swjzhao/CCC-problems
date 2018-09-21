package CCC;
import java.util.Scanner;


public class CCC_2005_J1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pa, pb;
		System.out.println("Number of daytime minutes");
		double dm = s.nextDouble();
		double dm1 = dm;
		System.out.println("Number of evening minutes");
		double em = s.nextDouble();
		double em1 = em;
		System.out.println("Number of weekend minutes");
		double wm = s.nextDouble();
		if(dm - 100 < 0){
			dm = 0;
		}else{
			dm = dm - 100;
		}
		pa = dm*(0.25) + em*(0.15) + wm*(0.2);
		dm = dm1;
		em = em1;
		if(dm - 250 < 0){
			dm = 0;
		}else{
			dm = dm -250;
		}
		pb = dm*(0.45) + em*(0.35) + wm*(0.25);
		System.out.println("Plan A costs $" + pa );
		System.out.println("Plan B costs $" + pb);
		if(pa > pb){
			System.out.println("Plan A is the cheapest");
		}else{
			System.out.println("Plan B is the cheapest");
		}
		
		
	}

}
