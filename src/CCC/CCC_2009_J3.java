package CCC;
import java.util.Scanner;


public class CCC_2009_J3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int o = s.nextInt();
		int v = o-300;
		if(v > 2359){
			v -= 2400;
		}else if(v < 0){
			v = 2400+v;
		}
		int e = o-200;
		if(e > 2359){
			e -= 2400;
		}else if(e < 0){
			e = 2400+e;
		}
		int w= o-100;
		if(w > 2359){
			w -= 2400;
		}else if(w < 0){
			w = 2400+w;
		}
		int t = o;
		int h = o+100;
		if(h > 2359){
			h -= 2400;
		}else if(h < 0){
			h = 2400+h;
		}
		int sj = o + 130;
		if(sj%100 >=60){
			
			sj += 100;
			sj -= 60;
			
		}
		if(sj > 2359){
			sj -= 2400;
		}else if(sj < 0){
			sj = 2400+sj;
		}
		System.out.println(o + " in Ottawa");
		System.out.println(v + " in Victoria");
		System.out.println(e + " in Edmonton");
		System.out.println(w + " in Winnipeg");
		System.out.println(t + " in Toronto");
		System.out.println(h + " in Halifax");
		System.out.println(sj + " in St. John's");
	}

}
