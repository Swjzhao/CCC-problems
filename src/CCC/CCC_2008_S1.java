package CCC;
import java.util.ArrayList;
import java.util.Scanner;


public class CCC_2008_S1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] str = new String[10000];
		int[] t = new int[10000];
		int c = 0, c1 = 0;
		int h = 0, h1 = 0;
		for(int i = 0; i<str.length; i++){
			
			str[i] = s.next();
			if(str[i].equals("done")){
				break;
			}
			t[i] = (Integer.parseInt(s.next()));
			
			
		}
		c = t[0];
		for(int i = 1; i < str.length; i++){
			
			if(t[c1] > t[i]){
				c1 = i;
				c = t[i];
			}
			
		}
		h = t[0];
		for(int i = 1; i < str.length; i++){
			
			if(t[h1] < t[i]){
				h1 = i;
				h = t[i];
			}
			
		}
		
		
		System.out.println(str[c1]);
		System.out.println(str[h1]);
	}

}
