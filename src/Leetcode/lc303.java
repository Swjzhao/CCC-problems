package Leetcode;

public class lc303 {

	public static void main(String[] args) {
		
		final long starttime = System.currentTimeMillis();
		
//		int[] arr = new int[100000000];
//		for(int i = 0; i < 100000000; i++){
//			arr[i] = (int)(Math.random()*10) * (int)(Math.pow(-1, (int)(Math.random()*2)));
//		}
		
		int[] arr = {1,2,5};
		NumArray na = new NumArray(arr);
		System.out.println(na.sumRange(0, 2));
		final long endtime = System.currentTimeMillis();
		
		System.out.println(endtime-starttime);
	}
		
}

class NumArray {
    
	int[] nums;
    int[] arr;
    public NumArray(int[] nums) {
        
        
        this.nums = nums;
        if(nums.length != 0){
        arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1; i < arr.length; i++){
        	arr[i] = nums[i] + arr[i-1];
        }
        }
        
    }

    public int sumRange(int i, int j) {
        int t = 0;
        if(nums.length != 0){
            t = arr[j] - arr[i] + nums[i];
        }else{
            t = 0;
        }
        return t;
    }
}

