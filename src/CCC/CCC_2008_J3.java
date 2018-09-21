package CCC;
import java.util.Scanner;


public class CCC_2008_J3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String [][] map = {{"A", "B", "C", "D","E","F"},
							{"G", "H", "I", "J", "K", "L"},
							{"M", "N", "O", "P", "Q", "R"},
							{"S", "T", "U", "V", "W", "X"},
							{"Y","Z"," ","-", "_","enter"}};
	
		String cmd = s.nextLine();
		int mov = 0;
		int px = 0, py = 0;
		boolean b  = true;
		
		for(int i = 0; i < cmd.length(); i++){
			b = true;
			
			for(int x = 0; x < map.length; x++){
				for(int y = 0; y < map[0].length; y++){
				
					if(map[x][y].equals(cmd.substring(i, i+1))){
						
						mov += Math.abs(x-px) + Math.abs(y-py);
						px = x;
						py = y;
						b = false;
						break;
						
					}
					
				}
				if(!b){
					break;
				}
			}
		}
		
		mov += Math.abs(px - map.length+1) + Math.abs(py - map[0].length+1);
		System.out.println(mov);

	}

}
