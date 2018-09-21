import java.util.Scanner;


public class Strings_9_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String bs = sc.nextLine();
		int i = 0, a = 0;

		String s = "";
		
		
		
		for(int x = bs.length()-1; x >= 0; x--){
			a = 0;
			
			if(bs.charAt(x) == '1'){
				if(x == bs.length()-1){
					a = 1;
				}else{
					a = 2;
					for(int xx = 1; xx < bs.length()-1-x; xx++){
					  a *= 2;
					}
				}
				
				
			}else{
				
			}
	
			i += a;
		}
		System.out.println(i);
		
		
	}

}
