import java.util.Scanner;


public class ProgrammingEx_6_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int ns  =  s.nextInt();
		int[] sa = new int[ns];
		char c;
		System.out.println("Enter " + ns + " scores");
		
		int big = 0; int cbig = 0;
		
		for(int i = 0; i < ns; i ++ ){
		 
			sa[i] = s.nextInt();
			if(sa[i] >= cbig){
				
				big = sa[i];
				cbig = sa[i];
			}
			
		}
		
		for(int i = 0; i <ns; i++){
			
			if(sa[i] >= big - 10){
				c = 'A';
			}else if(sa[i] >= big - 20){
				c = 'B';
			}else if(sa[i] >= big - 30){
				c = 'C';
			}else if(sa[i] >= big - 40){
				c = 'D';
			}else{
				c = 'F';
			}
			System.out.println("Student " + i + " score is " + sa[i] + " and grade is " + c);
			
		}
		
	}

}
