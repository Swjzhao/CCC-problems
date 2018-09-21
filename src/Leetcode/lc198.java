package Leetcode;

public class lc198 {

	public static void main(String[] args) {

		int[] arr = { 1, 3,1 };

		System.out.println(rob(arr));

	}

	public static int rob(int[] nums) {

		if (nums.length != 0) {

			int[] arr = new int[nums.length + 1];
			arr[0] = 0;
			arr[1] = nums[0];
			arr[2] = nums[1];
			int max = Integer.max(arr[1], arr[2]);
			
				for (int i = 3; i < arr.length; i++) {
					
						arr[i] = Integer.max(arr[i - 2] + nums[i - 1], arr[i - 3] + nums[i - 1]);
					if(arr[i] > max){
						max = arr[i];
					}

				}

//				for (int i = 0; i < arr.length; i++) {
//					System.out.print(arr[i] + " ");
//				}
//				System.out.println();

				return max;
			
		} else {
			return 0;
		}

	}

}
