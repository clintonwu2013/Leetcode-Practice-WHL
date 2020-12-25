package leetcode20201021;

public class Leetcode62 {
	public int uniquePaths(int m, int n) {
		int[][] d = new int[m][n];
		if(m<=0 || n<=0) {
			return 0;
		}
		for(int i=0; i<m; i++) {
			d[i][0] = 1;
		}
		for(int j=0; j<n; j++) {
			d[0][j] = 1;
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				d[i][j] = d[i-1][j] + d[i][j-1];
			}
		}
		return d[m-1][n-1];

	}
}
