package leetcode20201021;

public class Leetcode63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int R = obstacleGrid.length;
		int C = obstacleGrid[0].length;
		if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Number of ways of reaching the starting cell = 1.
        obstacleGrid[0][0] = 1;
		for(int i=1; i<R; i++) {
			obstacleGrid[i][0]=(obstacleGrid[i][0] ==0 &&obstacleGrid[i-1][0]==1)?1:0;
		}
		for(int i=1; i<C; i++) {
			obstacleGrid[0][i]=(obstacleGrid[0][i] ==0 &&obstacleGrid[0][i-1]==1)?1:0;
		}
		for(int i=1;i<R;i++) {
			for(int j=1;j<C;j++) {
				if(obstacleGrid[i][j] == 1) {
					obstacleGrid[i][j] = 0;
				}else {
					obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
				}
			}
		}
		return obstacleGrid[R-1][C-1];
	}
}