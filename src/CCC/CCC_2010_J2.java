package CCC;
import java.util.Scanner;


public class CCC_2010_J2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		
		int s1 = calculateSteps(s, a, b);
		
		int s2 = calculateSteps(s, c, d);
		
		
		printResult(s1, s2);
	}
	
	
	private static int calculateSteps(int s, int a, int b) {
		int s1 = 0;
		for(int i = 0; s>0; i++){
			if(s > 0){
				if(i%2 == 0){
					
					s -= a;
					if(s < 0){
						s1 += s+a;
						break;
					}else{
						s1 += a;
					}
				}else{
					s -= b;
					if(s < 0){
						s1 -= s+b;
						break;
					}else{
						s1 -= b;
					}
				}
			}else{
				break;
			}
		}
		
		return s1;
	}

	private static void printResult(int s1, int s2) {
		System.out.println("Nikky has moved " + s1 + " steps away from the starting point and Byron has moved " + s2 + " steps from the starting point" );
		if(s1 > s2){
			System.out.println("Nikky has moved further");
		}else if(s1 < s2){
				System.out.println("Byron has moved further");
			
		}else{
			System.out.println("Both moved the same distance");
		}
	}

}
