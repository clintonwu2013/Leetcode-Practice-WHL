package leetcode20200515;

import java.util.List;

public class Leetcode120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		
		if(triangle.size() == 0) {
			return 0;
		}
		
		for(int i= triangle.size() -2; i>=0; i-- ) {
			for(int j=0; j<triangle.get(i).size(); j++) {
				triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j+1), triangle.get(i+1).get(j)));
			}
		}
		return triangle.get(0).get(0);
	}
}
