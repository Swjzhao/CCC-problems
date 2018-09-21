package CCC;
import java.util.Scanner;

public class CCC_2015_S3{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int g = s.nextInt();
		int p = s.nextInt();
		int total = 0;
		int[] planes = new int[p];
		int[] dock = new int[g+1];
		
		for(int i = 0; i < p; i++)
			planes[i] =s.nextInt();

		int index = 0;
		while(index < p){
			//System.out.println(planes[index]);
			int t = 0;
			
			while(planes[index] > 0 && dock[planes[index]] > 0){
				t = dock[planes[index]];
				dock[planes[index]]++;
				planes[index] -= t;
			}
			
			
			if(planes[index] <= 0){
				break;
			}
			
			dock[planes[index]] += 1;
			total++;
	
			
			index++;
			
			
		}
		System.out.println(total);
		
	}

}
