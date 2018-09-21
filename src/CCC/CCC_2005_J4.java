package CCC;
import java.util.Scanner;

public class CCC_2005_J4 {
	
	//11012311
	//11789411
	//45601567
	//30002348
	//21900219
	//11800311
	//11765411
	//public static int xx = 0,xy = 0, yy = 0, yx = 0;
	public static int m = 0;
	public static int rrw =0 ;
	public static boolean b = false;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int w = s.nextInt();
		int h = s.nextInt();
		int rw = s.nextInt();
		rrw = rw;
		int rh = s.nextInt();
		int step = s.nextInt();
		int x = 0, y = 0;

		boolean[][] map = new boolean[h][w];

		for (int r = 0; r < h; r++) {
			for (int c = 0; c < w; c++) {

				if (r < rh && c < rw || r < rh && c >= w - rw || r >= h - rh
						&& c < rw || r >= h - rh && c >= w - rw) {

				} else {
					map[r][c] = true;
				}

			}
		}

	

		map[0][rw] = false;
		x = 0;
		y = rw;
		
	
		//display(map);
		moveNext(map, x, y, 1, 1, 0, step);
		
		

	}

	public static void moveNext(boolean[][] map, int x, int y, int dx,
			int dy, int cstep, int step) {
			
			if(x == 1 && y == rrw){
				
				m++;
			
				
			}
			map[x][y] = false;
			
			if(x == 0+m){
				dx = 1;
				
			}
			if(y == 0+m){
				dy = 1;
				
			}
			if(x == map.length-1-m){
				dx = -1;
				
			}
			if(y == map[0].length-1-m){
				dy = -1;
				
			}	
			//System.out.println(cstep);
			
			if(cstep == step){
				
				System.out.println(y+1);
				System.out.println(x+1);
				b = true;
				return;
				
			}else{
				
				if(dx > 0 && dy >0 ){
					
					if(map[x][y+1]){
					
						
						moveNext(map,x,y+1,dx,dy,cstep+1,step);
						
					}else if(map[x+1][y]){
						
					
							moveNext(map,x+1,y,dx,dy,cstep+1,step);
						
					}
					
				}else if(dx > 0 && dy < 0){
				
					
					if(map[x+1][y]){
						
							moveNext(map,x+1,y,dx,dy,cstep+1,step);
						
					}else if(map[x][y-1]){
						
						moveNext(map,x,y-1,dx,dy,cstep+1,step);
					}
				}else if(dx < 0 && dy < 0){
				
					if(map[x][y-1]){
						moveNext(map,x,y-1,dx,dy,cstep+1,step);
					}else if(map[x-1][y]){
						moveNext(map,x-1,y,dx,dy,cstep+1,step);
					}
									
				}else if(dx < 0 && dy > 0){
				
					if(map[x-1][y]){
						moveNext(map,x-1,y,dx,dy,cstep+1,step);
					}else if(map[x][y+1]){
						moveNext(map,x,y+1,dx,dy,cstep+1,step);
					}
				}
				
				if(!b){
				System.out.println(y+1);
				System.out.println(x+1);
				b = true;
			
				}
			
				
			}
		

	}

	public static void display(boolean[][] map) {

		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[0].length; c++) {
				if (map[r][c]) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}

			}
			System.out.println();
		}

	}

}
