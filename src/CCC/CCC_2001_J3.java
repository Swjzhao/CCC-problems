package CCC;
import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2001_J3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter cards: ");
		String card = s.next();
		
		int[] type = new int[4];
		int[] points = new int[4];
		int[] spacing = {5,8,6,6};
		String[] str = {"Clubs", "Diamonds","Hearts","Spades"};
		
		ArrayList<ArrayList> a = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		ArrayList<String> h = new ArrayList<>();
		ArrayList<String> ss = new ArrayList<>();
		a.add(c);
		a.add(d);
		a.add(h);
		a.add(ss);
		int x = 0;
		int t = 0;
		int spc = 0;

		for (int i = 0; i < card.length(); i++) {

			switch (card.charAt(i)) {

				case 'C':
					x = 0;
					break;
				case 'D':
					x = 1;
					break;
				case 'H':
					x = 2;
					break;
				case 'S':
					x = 3;
					break;
				default:
					type[x]++;
					if(x == 0){
						c.add(card.substring(i,i+1));
					}else if(x == 1){
						d.add(card.substring(i,i+1));
					}else if(x == 2){
						h.add(card.substring(i,i+1));
					}else if(x == 3){
						ss.add(card.substring(i,i+1));
					}
					break;

			}
			
			switch (card.charAt(i)) {

				case 'A':
					points[x] += 4;
					break;
				case 'K':
					points[x] += 3;
					break;
				case 'Q':
					points[x] += 2;
					break;
				case 'J':
					points[x] += 1;
					break;

			}

		}
		for(int i = 0; i < 4; i++){
			
			switch(type[i]){
				
				case 0: points[i] += 3;
						break;
				case 1: points[i] += 2;
						break;
				case 2: points[i] += 1;
						break;
			}
			
		}
		for(int i = 0;i < 4; i++){
			t += points[i];
		}
	
		System.out.println("Cards Dealt          Points");
		for(int i = 0; i < 4; i++){
			spc = 0;
			System.out.print(str[i] + " ");
			for(int ii = 0; ii < a.get(i).size(); ii++){
				System.out.print(a.get(i).get(ii) + " ");
				spc += 2;
			}
			for(int ii = spacing[i] + spc; ii < 23; ii++){
				System.out.print(" ");
			}
			System.out.println(points[i]);
		}
		
		System.out.println("                 Total:" + t);
		
	}

}
