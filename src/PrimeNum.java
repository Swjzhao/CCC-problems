import java.util.Scanner;


public class PrimeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int pp = 0;
		boolean b = true;
		for(p = p; p > 1; p--){
			b = true;
			for(int x = 2; x < p  ; x++){
				if(p%x == 0){
					b = false;
				}
			}
			if(b){
				pp++;
			}
		}
		System.out.println(pp);

	}

}
