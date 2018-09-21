import java.util.Scanner;


public class GCF {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(GCD(s.nextInt(),s.nextInt()));

	}
	public static int GCD(int a, int b){
		
		if(a == b){
			return a;
		}else{
			if(a > b){
				a -= b;
				return GCD(a,b);
			}else{
				b -= a;
				return GCD(a,b);
			}
		}
		
	}

}
