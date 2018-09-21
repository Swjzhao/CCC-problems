import java.util.Scanner;


public class SpecialNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double n =  s.nextDouble();
		int p = 0;
		double a1 = Math.sqrt(n);
		double b1 = Math.pow(n, 1.0/3);
		for(int a = 0; a <= a1; a++){
			for(int b = 0; b <= b1; b++){
				if(a*a == b*b*b){
					p++;
					System.out.println(a*a + ":" + b*b*b + " ");
					
				}
			}
		}
		System.out.println(a1 + " " + b1);
		System.out.println(p);
	}

}
