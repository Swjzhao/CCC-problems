import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = reverse("cat");
		System.out.println(str);
	}
	public static String reverse(String s){
		
		if(s.length() == 0){
			return "";
		}
		return(s.charAt(s.length()-1) + "") + reverse(s.substring(0, s.length()- 1));
		
	}

}
