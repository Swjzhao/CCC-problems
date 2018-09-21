package CCC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CCC_2005_J5 {

	public static int counter =0 ;
	
	public static void main(String[] args) {
		
		//0,990,1010,1970,2030,2940,3060,3930,4060,4970,5030,5990,6010,7000
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> ia = new ArrayList<>();
		ia.add(0);
		ia.add(990);
		ia.add(1010);
		ia.add(1970);
		ia.add(2030);
		ia.add(2940);
		ia.add(3060);
		ia.add(3930);
		ia.add(4060);
		ia.add(4970);
		ia.add(5030);
		ia.add(5990);
		ia.add(6010);
		ia.add(7000);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = 0;
		for(int i = 0; i < c ; i++){
			d = s.nextInt();
			ia.add(d);
		}
		int cp = 0;
		int goal = 7000;
		Collections.sort(ia);
		recursion(ia,cp,goal,a,b);
		System.out.println(counter);

	}
	public static void recursion(ArrayList<Integer> ia, int cp, int goal, int a, int b){
	
		if(cp >= goal){
			counter++;
			return;
		}else{
			for(int i = 0; i < ia.size(); i++){
				if(ia.get(i) >= cp + a && ia.get(i) <= cp +b){
					recursion(ia,ia.get(i),goal,a,b);
				}
			}
		}
		
	}
}
