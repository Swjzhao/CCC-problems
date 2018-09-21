
public class ProgrammingExercise_33 {

	public static void main(String[] args) {
		String a = "";
		int d = 0;
		for(int i = 1; i < 10000 ;i++){
			for(int ii = 1; ii < 5000; ii++ ){		
				if(i%ii == 0){
					if(ii != i){
					    d += ii;
					
					}
				}
			}
			
			if(i == d){
				a += i + " ";
			}
			d = 0;
		}
		System.out.println(a);
	}

}
