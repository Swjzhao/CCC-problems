package Leetcode;

public class lc70 {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int a = s.climbStairs(5);
		//System.out.println(s.climbStairs(4));

	}

}
class Solution {
    public int climbStairs(int n) {
    	
    	if(n > 1){
    	int[] arr = new int[n];
    	arr[0] = (int)(1/1) + (int)(1/4);
    	arr[1] = (int)(2/1) + (int)(2/4);
    	for(int i = 2; i < arr.length; i++){
    		
    		arr[i] = arr[i-1]+arr[i-2];
    		
    	}
    	
    	
    
    	
    	
		return arr[n-1];
    	}else if(n > 0){
    		return (int)(1/1) + (int)(1/4);
    	}else{
    		return 0;
    	}
        

    }
}
