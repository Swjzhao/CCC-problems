package CCC;
import java.util.ArrayList;
import java.util.Scanner;


public class CCC_2011_J3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 2;
		ArrayList<Integer> t = new ArrayList<>();
		t.add(s.nextInt());
		t.add(s.nextInt());
		for(int y = 0; y < y+1;y++){
			if(t.get(y) > t.get(y+1)){
				t.add(t.get(y) - t.get(y + 1));
			}else{
				break;
			}
		}
		System.out.println(t.size());
	}

}
