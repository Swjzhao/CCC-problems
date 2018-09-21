package CCC;
import java.util.ArrayList;
import java.util.Scanner;


public class CCC_2008_J2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Character> ch = new ArrayList<>();
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('D');
		ch.add('E');
		int b = 0;
		int n = 0;
		do{
		
		b = s.nextInt();
		n = s.nextInt();
		switch(b){
		 case 1: for(int i = 0 ;i < n; i++){
		 		ch.add(ch.get(0));
		 		ch.remove(0);
		 		}
		 		break;
		 case 2: for(int i = 0 ;i < n; i++){
			    ch.add(0,ch.get(4));
		 		ch.remove(5);
		 		}
		 		break;
		 case 3: for(int i = 0 ;i < n; i++){
		 		ch.add(0,ch.get(1));
		 		ch.add(1,ch.get(1));
		 		ch.remove(2);
		 		ch.remove(2);
		 		}
		 		break;
		 case 4: 
		 		break;
		 }
		
		
		}while(b != 4);
		
		System.out.println(ch);
	}

}
