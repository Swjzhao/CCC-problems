import java.util.ArrayList;
import java.util.Scanner;


public class ReverseInt {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int bint = s.nextInt();
		int rint = 0;
		String bsint = String.valueOf(bint);
		ArrayList<String> ints = new ArrayList<>();
		boolean b = false;
		int y = 0;
		if(bint < 0){
			b = true;
		}
		
		for(int x = 0; x < bsint.length(); x++){
			
			ints.add(String.valueOf(bsint.charAt(x)));
			
		}
		if(b){
			System.out.print("-");
			y++;
		}
		
		for(int x = 0; x < bsint.length() - y; x++){
			
			if(b){
				System.out.print(ints.get(bsint.length()-x-1));
			}else{
				System.out.print(ints.get(bsint.length()-x-1));
			}
		}
		
		
		
		
	}

}
