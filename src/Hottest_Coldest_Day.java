import java.util.Scanner;


public class Hottest_Coldest_Day {

	public static void main(String[] args) {
		
		int[] temperature = new int[7];
		int h = 0, c = 0;
		int hi = 0, ci = 0;
		Scanner s = new Scanner(System.in);
		String hstr = null;
		String cstr = null;
		
		for(int i = 0; i < temperature.length; i++){
			
			temperature[i] = s.nextInt();
			
		}
		h = temperature[0];
		for(int i = 1; i < temperature.length; i++){
			
			if(temperature[hi] < temperature[i]){
				h = temperature[i];
				hi = i;
			}
			
		
		}
		c = temperature[0];
		for(int i = 1; i < temperature.length; i++){
			
			if(temperature[ci] > temperature[i]){
				c = temperature[i];
				ci = i;
			}
			
		
		}
		switch(hi){
		
		case 0: hstr = "Sunday";
				break;
		case 1: hstr = "Monday";
				break;
		case 2: hstr = "Tuesday";
				break;
		case 3: hstr = "Wednesday";
				break;
		case 4: hstr = "Thursday";
				break;
		case 5: hstr = "Friday";
				break;
		case 6: hstr = "Saturday";
		break;
		
		}
		switch(ci){
		
		case 0: cstr = "Sunday";
				break;
		case 1: cstr = "Monday";
				break;
		case 2: cstr = "Tuesday";
				break;
		case 3: cstr = "Wednesday";
				break;
		case 4: cstr = "Thursday";
				break;
		case 5: cstr = "Friday";
				break;
		case 6: cstr = "Saturday";
		break;
		
		}
		
		
		
		System.out.println(hstr + " was hottest with " + h + " C");
		System.out.println(cstr + " was coldest with " + c + " F");

	}

}
