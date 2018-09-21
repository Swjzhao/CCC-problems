package CCC;
import java.util.*;

public class CCC_2009_J4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		String[] words = {"WELCOME",
				"TO", "CCC" ,"GOOD" ,"LUCK" ,"TODAY"};
		int a = 0;
		int hold = 0;
		for(int i = 0; i < words.length; i++){
			a += words[i].length();
			if(a > w){
				
				//System.out.println(i);
				i--;
				int num = i-hold+1;
				//System.out.println(num);
				String[] arr = new String[num];
				for(int j = 0; j < arr.length; j++){
					arr[j] = words[j+hold];
				}
				
			
				for(int j = 0; j < (w-a+words[i+1].length())+1 ; j++){
				
					int f = j%num;
					arr[f] += ".";
				}
				String str = "";
				if(num == 1){
					System.out.println(arr[0]);
				}else{
					for (int j = 0; j < num-1; j++) {
						str += arr[j] + ".";
					}
					System.out.println(str + words[i]);
				}
				
				
				
				hold = i+1;
				a= 0;
			}else{
				a++;
				if(i == words.length-1){
					
					int num = i-hold+1;
					//System.out.println(num);
					String[] arr = new String[num];
					for(int j = 0; j < arr.length; j++){
						arr[j] = words[j+hold];
					}
					
				
					for(int j = 0; j < (w-a)+1; j++){
					
						int f = j%num;
						arr[f] += ".";
					}
					String str = "";
					if(num == 1){
						System.out.println(arr[0]);
					}else{
						for (int j = 0; j < num-1; j++) {
							str += arr[j] + ".";
						}
						System.out.println(str + words[i]);
					}
				}
			}
			
		}
		
			
			
		
		
	}
}
