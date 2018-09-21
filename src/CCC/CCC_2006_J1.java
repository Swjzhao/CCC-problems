package CCC;
import java.util.Scanner;


public class CCC_2006_J1 {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int cal = 0;
		int burger, side_order, drink, dessert;
		burger = s.nextInt();

			
		
		switch(burger){
			
			case 1: 
				cal += 461;
				break;
			case 2:
				cal += 431;
				break;
			case 3:
				cal += 420;
				break;
			default:
				cal += 0;
				break;
		}
		
		side_order = s.nextInt();
		
		switch(side_order){
		
			case 1:
				cal += 100;
				break;
			case 2:
				cal += 57;
				break;
			case 3:
				cal += 70;
				break;
			default:
				cal += 0;
				break;
				
		
		}
		
		drink = s.nextInt();
		
		switch(drink){
		
			case 1:
				cal += 130;
				break;
			case 2:
				cal += 160;
				break;
			case 3:
				cal += 118;
				break;
			default:
				cal += 0;
				break;
				
		
		}
		dessert = s.nextInt();
		
		switch(dessert){
		
			case 1:
				cal += 167;
				break;
			case 2:
				cal += 266;
				break;
			case 3:
				cal += 75;
				break;
			default:
				cal += 0;
				break;
				
		
		}
		System.out.println(cal);
		
		
		

	}

}
