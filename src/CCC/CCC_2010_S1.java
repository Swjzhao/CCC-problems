package CCC;

import java.util.Scanner;

public class CCC_2010_S1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String[] comp = new String[n];
		int[] ram = new int[n];
		int[] cpu = new int[n];
		int[] disk = new int[n];
		int[] form = new int[n];
		
		for(int i = 0; i < n; i++){
			comp[i] = s.next();
			ram[i] = s.nextInt();
			cpu[i] = s.nextInt();
			disk[i] = s.nextInt();
			form[i] = 2*ram[i] + 3*cpu[i] +disk[i];
		}
		int biggest = 0;
		int smallest = 0;
		for(int i = 0; i < n; i++){
			
			if(form[biggest] < form[i]){
				biggest =  i;
				
				
			}
			
		}
		for(int i = 0; i < n; i++){
			if(form[smallest] < form[i] && i != biggest){
				smallest = i;
			}
		}
		System.out.println(comp[biggest]);
		System.out.println(comp[smallest]);
	}

}
