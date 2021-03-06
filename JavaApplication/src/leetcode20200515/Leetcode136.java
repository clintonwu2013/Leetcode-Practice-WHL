package leetcode20200515;

import java.util.HashMap;
import java.util.Map;

public class Leetcode136 {
	public int singleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
		}
		for(int key: map.keySet()) {
			if(map.get(key)==1) {
				return key;
			}
		}
		
		return -1;
	}
}
