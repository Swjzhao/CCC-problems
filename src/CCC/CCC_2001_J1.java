package CCC;
import java.util.Scanner;


public class CCC_2001_J1 {
// not finished
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int st = s.nextInt();
		for(int x = 0; x < st; x++){
			for(int y = 0; y < st*2; y++){
				if(x*2%st <= 1){
					if(y < st-(st-1) + (x*2)){
						System.out.print("*");
					}else if(y >= st+(st-1) - (x*2)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					if(y < st-(st-1) + st-(x*2)){
						System.out.print("*");
					}else if(y >= st+(st-1) - (st-(x*2))){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	

	}

}
