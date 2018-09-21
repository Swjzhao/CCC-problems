import java.util.Scanner;


public class InArray {

	public static void main(String[] args) {
	
		int[] temp = {12, 11, 9 ,8, 10 ,11, 11};
		Scanner s = new Scanner(System.in);
		int n = 0, n1 = 0;
		String a = "";
		Boolean b = false;
		n = s.nextInt();
		for(int i = 0; i < temp.length; i++){
			
			if(n == temp[i]){
				b = true;
				a += i + ", ";
			}
			
		}
		
		if(b){
			System.out.println("The number " + n + " is in index " + a);
			
		}else{
			System.out.println("The number "+ n + " is not in the array");
		}
	}

}
