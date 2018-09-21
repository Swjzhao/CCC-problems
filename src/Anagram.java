import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Anagram {
		public static void main(String[] args){
			
			 Scanner scanner = new Scanner(System.in);
			 int glassNum = scanner.nextInt();
			 int threshold = scanner.nextInt();
			 int[][] glasses = new int[glassNum * 2][4];
			 int minx = 2000000000;
			 int maxx = -1;
			 int miny = 2000000000;
			 int maxy = -1;
			 for(int i = 0; i < glassNum; i ++){
				 int x1 = scanner.nextInt();
				 int y1 = scanner.nextInt();
				 int x2 = scanner.nextInt();
				 int y2 = scanner.nextInt();
				 int tint = scanner.nextInt();
				 minx = Math.min(minx, x1);
				 maxx = Math.max(maxx, x2);
				 miny = Math.min(miny, y1);
				 maxy = Math.max(maxy, y2);
				 int[] t1 = {x1, y1, y2, tint};
				 int[] t2 = {x2, y1, y2, -tint};
				 glasses[i] = t1;
				 glasses[i + glassNum] = t2;
			 }
			 scanner.close();
			 Arrays.sort(glasses, new Comparator<int[]>(){
				 @Override
		            public int compare(final int[] entry1, final int[] entry2) {
					 	return entry1[0] - entry2[0];
		            }
			 });
			 int[] sweepLine = new int[maxy - miny];
			 int index = 0;
			 int currentValid = 0;
			 int count = 0;
			 for(int x = minx; x < maxx; x ++){
				 if(x == glasses[index][0]){
					 for(int j = glasses[index][1]; j < glasses[index][2]; j ++){
						 sweepLine[j - miny] += glasses[index][3];
						 if(sweepLine[j - miny] >= threshold)
							 currentValid ++;
						 else{
							 try{
								 if(sweepLine[j - miny] - glasses[index][3] >= threshold)
									 currentValid --;
							 }catch(ArrayIndexOutOfBoundsException e){}
						 }
					 }
					 index ++;
				 }
				count += currentValid;
			 }
			 System.out.println(count);
		}
}
