package leetcode20201020;

public class Leetcode1342 {
	public int numberOfSteps(int num) {
		if(num ==0 ) {
			return 0; 
		}
		int ans = 0;
		while(num>1) {
			int residue = num%2;
			if(residue==0) {
				ans = ans +1;
			}else {
				ans = ans +2;
			}
			num = num/2;
		}
		return ans+1;

	}
}
