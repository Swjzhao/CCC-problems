import java.util.Scanner;


public class NaturalNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(nn(s.nextInt()));
	}
	public static boolean nn(int n){
		
		if(n < 0){
			return false;
		}else{
			return true;
		}
	}

}
