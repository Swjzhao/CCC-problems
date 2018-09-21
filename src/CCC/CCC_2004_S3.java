package CCC;
import java.util.Arrays;
import java.util.Scanner;


public class CCC_2004_S3 {

	public static void main(String[] args) {

//		1 2 3 A1+A2+A3 A3+A4 A1+A4+A5 A8+A9 A9 A8
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
//		0 0 0 0 0 0 0 0 0
		
		Scanner s = new Scanner(System.in);
		//int[][] table = new int[10][9];
		String[][] values = new String[10][9];
		String str = "";
	
		int convert = 0;
		for(int i = 0; i < values.length; i++){
			Arrays.fill(values[i], 0+"");
		}
		for(int r = 0;r < 10; r++){
			for(int c = 0; c < 9;c ++){
				
				str = s.next();
				try{
					convert = Integer.parseInt(str);
					values[r][c] = convert + "";
				}catch(Exception e){
					String[] parts = str.split("\\+");
					for(int i = 0; i < parts.length; i++){
						if(values[parts[i].charAt(0) - 'A'][(Integer.parseInt(parts[i].charAt(1)+""))-1].equals(0+"") ||
								values[parts[i].charAt(0) - 'A'][(Integer.parseInt(parts[i].charAt(1)+""))-1].equals("*") ){
							values[r][c] = "*";
							break;
						}else{
							values[r][c] = Integer.parseInt(values[r][c]) +Integer.parseInt(values[parts[i].charAt(0) - 'A'][Integer.parseInt(parts[i].charAt(1)+"")-1]) + "";
						}
					}
				}
				
			}
			
		}
		
		for(int r = 0; r < 10;r ++){
			for(int c = 0;c < 9;c++){
				System.out.print(values[r][c]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		

	}

}
