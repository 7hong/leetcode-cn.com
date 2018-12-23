package leetcode.problemset;

public class Solution {

	/**
	 * 16. 最接近的三数之和
	 * 执行用时: 1323 ms, 在3Sum Closest的Java提交中击败了0.99% 的用户
	 * @param nums
	 * @param target
	 * @return
	 */
    public int threeSumClosest(int[] nums, int target) {
    	int[] arr = new int[3];
    	int cj = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k = 0; k < nums.length; k++) {
                    if(i == j || j == k || i == k){
                        continue;
                    }
                    int temp = nums[i] + nums[j] + nums[k];
                    int newCj = temp - target > 0 ? temp - target :target-temp;
					if(newCj < cj) {
						arr[0] = nums[i];
						arr[1] = nums[j];
						arr[2] = nums[k];
						cj = newCj;
					}
				}
			}
		}
        return arr[0] + arr[1] + arr[2];
    }

    
    public static void main(String[] args) {
//		int a = new Solution().threeSumClosest(new int[]{-1,2,1,-4}, 1);
//		System.out.println(a);
    	
    	
    	//2018年12月19日22:52:02
    //	System.out.println(new Solution().strStr("hello","ll"));
		
	}
}
