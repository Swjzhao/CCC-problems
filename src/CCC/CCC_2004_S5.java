package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_2004_S5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt(), n = s.nextInt(); 
		
		while(m != 0 && n != 0){
			int[][] map = new int[m+2][n+1];
			int[][] arr = new int[m+1][n+1];
			for(int i = 1; i < m +1 ; i++){
				String r = s.next();
				for(int j = 0; j < r.length() ;j++){
					
					if(r.charAt(j) == '.'){
						map[i][j] = 0;
						
					}else if(r.charAt(j) == '*'){
						map[i][j] = -1;
					}else{
						map[i][j] = Integer.parseInt(r.charAt(j)+ "");
						
					}
				}
			}
			arr[m][0] = map[m][0];
			for(int i = m-1; i > 0;i--){
				arr[i][0] = map[i][0] + arr[i+1][0];
			}
			
			for(int i = 1; i < n; i++){
				int[] a = new int[m+1];
				int[] b = new int[m+1];
				for(int j = 1; j < m+1;j++){
					if(map[j][i] != -1)
						a[j] = Math.max(arr[j][i-1],a[j-1]) + map[j][i];
					else
						a[j] = 0;
				}
				b[m]= arr[m][i-1] + map[m][i];
				for(int j = m-1; j >= 1;j--){
					if(map[j][i] != -1)
						b[j] = Math.max(arr[j][i-1],b[j+1]) + map[j][i];
					else
						b[j] = 0;
				}
//				
				for(int j: a)
					System.out.print(j + " ");
				
				System.out.println();
				for(int j:b)
					System.out.print(j + " ");
				System.out.println();
				System.out.println();
//				
				for(int j = 1; j < m+1;j++){
					if(map[j][i] != -1)
						arr[j][i] = Math.max(a[j], b[j]);
					else
						arr[j][i] = 0;	
				}
				
				
			}
			for(int[] k : arr){
				for(int l : k){
					System.out.print(l + " ");
				}
				System.out.println();
			}
				
			System.out.println(arr[m][n-1]);	

			m = s.nextInt(); n = s.nextInt();
		}
	}

}
