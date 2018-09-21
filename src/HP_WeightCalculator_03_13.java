import java.util.ArrayList;
import java.util.Scanner;


public class HP_WeightCalculator_03_13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = " ";
		Double d = 0.0;
		ArrayList<String> sa = new ArrayList<>();
		ArrayList<Double> da = new ArrayList<>();
		ArrayList<String> la = new ArrayList<>();
		ArrayList<Double> ga = new ArrayList<>();
		
		while(0 < 1){
			
			str = s.next();
			
			if(str.equals("END")){
				try{
					int a = s.nextInt();
					if(a == 0){
						a = s.nextInt();
						if(a == 0){
							a = s.nextInt();
							if(a == 0){
								break;
							}
						}
					}
				}catch(Exception e){
					
				}
				
			}
			d = s.nextDouble();
			sa.add(str);	
			str = s.next();
			da.add(d);
			d = s.nextDouble();
			la.add(str);
			ga.add(d);
			
			
		}
		for(int i = 0; i < sa.size(); i++){
			System.out.println("On " + la.get(i) + ", " + sa.get(i) + 
								" would weigh " + da.get(i)*ga.get(i) +
								" pounds");
		}
	}

}
