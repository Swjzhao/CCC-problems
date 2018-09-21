import java.util.Scanner;


public class count8 {
	
	
	public static void main(String[] args) {
		
		
	}
	public static int count8(int n) {
	  


	  if(n == 0){
	 
	   return 0;

	  }
	  if(n%100 == 88){
		  return 2 + count8(n/10);
	  }else if(n%10 == 8){
		  return 1 + count8(n/10);
	   
	  }else{
	  
	
	    
	   return count8(n/10);

	  }
	}

	public static int count8noDouble(int n){
		
		if(n <= 0){
			return 0;
		}
		
		if(n%10 == 8){
			return 1 + count8noDouble(n/10);
		}else{
			return count8noDouble(n/10);
		}
	}

}
