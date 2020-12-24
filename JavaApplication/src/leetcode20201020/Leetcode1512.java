package leetcode20201020;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1512 {
	public int numIdenticalPairs(int[] nums) {
		int ans = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for(int idx : map.keySet()) {
			ans = ans + (map.get(idx)-1 + 1)*(map.get(idx)-1)/2;
		}
		return ans;
	}
}
