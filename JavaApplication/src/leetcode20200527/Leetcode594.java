package leetcode20200527;

import java.util.HashMap;

public class Leetcode594 {
	public int findLHS(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		//collect frequency map of all the numbers int nums
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for(int key: map.keySet()) {
			if(map.containsKey(key+1)) {
				res = Math.max(res, map.get(key)+map.get(key+1));
			}
		}
		return res;
	}
}
