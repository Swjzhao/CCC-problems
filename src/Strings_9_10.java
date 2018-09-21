import java.util.ArrayList;
import java.util.Scanner;


public class Strings_9_10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int n =s.nextInt();

		int x = 0;
		String y ="";
	    int i = n;
		int b = n;
		do{
			x = 0;
			if(n - Math.pow(2, i) >= 0){
			    x = 1;
			    n = (int) (n - Math.pow(2, i));
			}
			System.out.println(n);
			a.add(x);
			i--;
		}while(n > 0);
		for(int ii = a.size()-1 ; ii >= 0; ii--){
			y += a.get(ii);
		}
		System.out.println(y);

	}

}
