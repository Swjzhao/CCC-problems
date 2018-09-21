import java.util.Scanner;


public class HP_CheckDigit_02_14 {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		//int n =  s.nextInt();
		int[] b = new int[12];
		int o = 0, e = 0, t =0;
		for(int i = 0; i < 11; i++){
			b[i] = s.nextInt();
		}
		for(int i = 0; i < 11; i++){
			if(i%2 == 1){
				o+= b[i];
			}else{
				e += b[i];
			}
		}
		t = o*3 + e;
		t = t%10;
		if(t != 0){
			t = 10 - t;
		}
		b[11] = t;
		for(int i = 0; i < 12; i++){
			System.out.print(b[i] + " ");
		}
		//int[][] a = new int[n + 1][n + 1];
		
		
		/*for(int i = 0; i < n; i++){
			for(int ii = 0; ii < n; ii++){
				
				a[i][ii] = s.nextInt();
				
			}
			
			
		}*/
		
	}
	
}
