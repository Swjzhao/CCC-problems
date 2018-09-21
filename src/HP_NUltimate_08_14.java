import java.util.ArrayList;
import java.util.Scanner;


public class HP_NUltimate_08_14 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> sa = new ArrayList<>();
		String str;
		int i = 0;
		do{
			str =  s.next();
			sa.add(str);
			
		}while(!str.contains("$"));
		sa.remove(sa.size()-1);
		if(sa.size() < 1){
	
		}else{
		System.out.println(sa.get(sa.size()-n));
		}
	}

}
