package leetcode20201020;

public class Leetcode1480 {
	public int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		
		ans[0] = nums[0]; 
		int idx = 1;
		while(idx < ans.length) {
			ans[idx] = ans[idx-1]+nums[idx];
			idx++;
		}
		return ans;
	}
}
