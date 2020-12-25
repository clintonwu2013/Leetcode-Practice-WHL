package leetcode20201021;

public class Leetcode5 {
	public String longestPalindrome(String s) {
		boolean[][] d = new boolean[s.length()][s.length()];
		for(int i=0; i<s.length(); i++) {
			d[i][i] = true;
		}
		int bgn = 0;
		int end =0;
		for(int i=1;i<s.length();i++) {
			for(int j=0;j<i;j++) {
				if(s.charAt(i) == s.charAt(j)) {
					if(i-j==1 || d[i-1][j+1]) {
						d[i][j]=true;
						if(i-j>end-bgn) {
							end=i;
							bgn = j;
						}
					}
					
				}
			}
		}
		
		return s.substring(bgn,end+1);
	}
}
