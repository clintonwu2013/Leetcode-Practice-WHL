package leetcode20201020;

public class Leetcode1470 {
	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[2*n];
		int preIndex = 0;
		int suIndex = n;
		int idx = 0;
		while(preIndex<n && suIndex < 2*n) {
			ans[idx] = nums[preIndex];
			ans[++idx] = nums[suIndex];
			
			preIndex++;
			suIndex++;
			idx++;
			
		} 
		
		
		return ans;
	}
}
