import static java.lang.System.*;
import java.util.Scanner;


public class RomanNum {

	public static void main(String[] args) {
		out.println("Insert your integer");
		Scanner s = new Scanner(in);
		int inum = s.nextInt();
		int r = 1;
		int a = (inum%1000)/100, b = (inum%100)/10, c =  (inum%10), m = (inum%10000)/1000;
		String rnum = "", as = "", bs= "", cs = "",ms = "";
		//b = b - (b/10) * 10;
		//c = c - ((c/10) * 10 )- ((c/100) *100);
		
		if(a >= 1){
			
			switch(a){
			
				case 1: as = "C";
						break;
				case 2: as = "CC";
						break;
				case 3: as = "CCC";
						break;
				case 4: as = "CD";
						break;
				case 5: as = "D";
						break;
				case 6: as = "DC";
						break;
				case 7: as = "DCC";
						break;
				case 8: as = "DCCC";
						break;
				case 9: as = "CM";
						break;
				
				
			}
			
			
		}
		if(b >= 1){
			
			switch(b){
			
				case 1: bs = "X";
						break;
				case 2: bs = "XX";
						break;
				case 3: bs = "XXX";
						break;
				case 4: bs = "XL";
						break;
				case 5: bs = "L";
						break;
				case 6: bs = "LX";
						break;
				case 7: bs = "LXX";
						break;
				case 8: bs = "LXXX";
						break;
				case 9: bs = "XC";
						break;
				
				
			}
			
			
		}
		if(c >= 1){
			
			switch(c){
			
				case 1: cs = "I";
						break;
				case 2: cs = "II";
						break;
				case 3: cs = "III";
						break;
				case 4: cs = "IV";
						break;
				case 5: cs = "V";
						break;
				case 6: cs = "VI";
						break;
				case 7: cs = "VII";
						break;
				case 8: cs = "VIII";
						break;
				case 9: cs = "IX";
						break;
				
				
			}
			
			
		}
		if(m == 1){
			ms = "M";
		}
		
		rnum = ms + as + bs + cs;
		
		
		out.println(rnum);
		
	}

}
