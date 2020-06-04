package leetcode20200527;

public class Leetcode1304 {
	public int[] sumZero(int n) {
		int[] result = new int[n];
		if(n % 2 ==0) {
			for(int i=0; i< result.length; i=i+2) {
				result[i] = i;
				result[i+1] = -i;
			}
		}else {
			result[0] = 0;
			for(int i=1; i< result.length; i=i+2) {
				result[i] = i;
				result[i+1] = -i;
			}
		}
		return result;
	}
}
