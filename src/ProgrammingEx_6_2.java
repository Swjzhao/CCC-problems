import java.util.ArrayList;
import java.util.Scanner;


public class ProgrammingEx_6_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter your number. Enter a to exit");
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    Boolean b = true;
	    
	    while(b){
	    	
	    	try{
	    		
	    		a.add(s.nextInt());
	    		
	    	}catch(Exception e){
	    		b = false;
	    	}
	    	
	    }
	    
	    for(int i = 1; i<= a.size(); i++){
	    	
	    	System.out.print(a.get(a.size()-i));
	    	
	    }
	    
	    
	}
}
