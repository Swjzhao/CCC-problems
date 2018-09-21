package HPCW2013;

public class Q5 {

	public static void main(String[] args) {
		
		int n = 0;
		int t = 9;
		int[] arr = new int[t+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for(int i = 3; i <= t;i++){
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		System.out.println(arr[t]);
	}

}
