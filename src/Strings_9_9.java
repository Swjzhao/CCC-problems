import java.util.Scanner;


public class Strings_9_9 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String bs = sc.nextLine();
		int i = 0, a = 0;

		String s = "";
		
		
		
		for(int x = bs.length()-1; x >= 0; x--){
			a = 0;
			
			switch(bs.charAt(x)){
			
			case '0': a = 0;
			break;
			case '1': a = 1;
			break;
			case '2': a = 2;
			break;
			case '3': a = 3;
			break;
			case '4': a = 4;
			break;
			case '5': a = 5;
			break;
			case '6': a = 6;
			break;
			case '7': a = 7;
			break;
			case '8': a = 8;
			break;
			case '9': a = 9;
			break;
			case 'A': a = 10;
			break;
			case 'B': a = 11;
			break;
			case 'C': a = 12;
			break;
			case 'D': a = 13;
			break;
			case 'E': a = 14;
			break;
			case 'F': a = 15;
			break;
			}
			for(int xx = 1; xx < bs.length()-1-x; xx++){
				 
				a *= 16;
			
			}
	
			i += a;
		}
		System.out.println(i);
		
		
	}
	
}
