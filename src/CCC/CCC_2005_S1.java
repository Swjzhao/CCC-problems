package CCC;
import java.util.Scanner;


public class CCC_2005_S1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		String[] num = new String[26];
		
		num[0] = 2 + "";
		num[1] = 2 + "";
		num[2] = 2 + "";
		
		num[3] = 3 + "";
		num[4] = 3 + "";
		num[5] = 3 + "";
		
		num[6] = 4 + "";
		num[7] = 4 + "";
		num[8] = 4 + "";
		
		num[9] = 5 + "";
		num[10] = 5 + "";
		num[11] = 5 + "";
		
		num[12] = 6 + "";
		num[13] = 6 + "";
		num[14] = 6 + "";
		
		num[15] = 7 + "";
		num[16] = 7 + "";
		num[17] = 7 + "";
		num[18] = 7 + "";
		
		num[19] = 8 + "";
		num[20] = 8 + "";
		num[21] = 8 + "";

		num[22] = 9 + "";
		num[23] = 9 + "";
		num[24] = 9 + "";
		num[25] = 9 + "";
		
		
		for(int i = 0; i < n; i++){
			String str = s.nextLine();
			String[] parts = str.split("-");
			str = "";
			for(int j = 0; j < parts.length; j++){
				str += parts[j];
			}
			
			String str2 = "";
			for(int j = 0; j < 10; j++){
				if(str.charAt(j) <= 'Z' && str.charAt(j) >= 'A'){
					str2 += num[str.charAt(j) - 'A'];
				}else{
					str2 += str.charAt(j);
				}
			}
			String str3 = "";
			
			//System.out.println(str2);
			for(int j = 0; j < 10; j++){
				if(j == 3 || j == 6){
					str3 += "-" + str2.charAt(j);
				}else{
					str3 += str2.charAt(j);
				}
			}
			System.out.println(str3);
		}

	}

}
