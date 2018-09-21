package CCC;
import java.util.ArrayList;
import java.util.Scanner;


public class CCC_2014_J3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> fp = new ArrayList<>();
		ArrayList<Integer> sp = new ArrayList<>();
		int t = s.nextInt();
		int fpt = 100, spt = 100;
		int pl = 0;
		for(int i = 0; i < t; i++){
			fp.add(s.nextInt());
			sp.add(s.nextInt());
		}
		for(int i = 0; i < t; i++){
			
			if(fp.get(i) < sp.get(i)){
				pl = sp.get(i);
				fpt -= pl;
				
			}else if(fp.get(i) > sp.get(i)){
				pl = fp.get(i);
				spt -= pl;
				
			}
			
		}
		System.out.println(fpt);
		System.out.println(spt);

	}

}
