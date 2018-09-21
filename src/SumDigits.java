import java.util.Scanner;


public class SumDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		while(in != 0){
		 
		 System.out.println(sumDigits(in));
		 in = s.nextInt();
		}
	}
	
	public static int sumDigits(int n){
		
		if(n <= 0 ){
			return 0;
		}
		
		
		return n%10 + sumDigits(n/10);
	}

}
