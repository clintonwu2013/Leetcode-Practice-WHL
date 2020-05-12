package leetcode20200512;

import java.util.Arrays;

public class Leetcode1046 {
	public int lastStoneWeight(int[] stones) {
		int len = stones.length;

		if (len == 1) {
			return stones[0];
		}
		
		Arrays.sort(stones);
		
		int i = len -2;
		while( i > -1) {
			if(stones[i+1] - stones[i] == 0 ) {
				stones[i] = 0;
				stones[i+1] = 0;
				 i = i-2;
			}else if(stones[i+1] - stones[i] > 0) {
				stones[i] = stones[i+1]-stones[i];
				stones[i+1]=0;
				Arrays.sort(stones, 0, i+1);
				i--;
				
			}
		}
			
		return stones[0];

	}
}
