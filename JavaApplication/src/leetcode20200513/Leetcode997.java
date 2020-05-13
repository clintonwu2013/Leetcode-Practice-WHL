package leetcode20200513;

import java.util.HashSet;

public class Leetcode997 {
	public int findJudge(int N, int[][] trust) {
		
		int[] people = new int[N];
		
		for(int i = 0; i<trust.length; i++) {
			people[trust[i][1]-1] += 1;
			people[trust[i][0]-1] -= 1;
		}
		
		for(int j=0; j<people.length; j++) {
			if(people[j] == N-1) {
				return j+1;
			}
		}
		return -1;

	}

	public int findJudge2(int N, int[][] trust) {
		if (trust.length < (N - 1)) {
			return -1;
		}
		if (trust.length == 0) {
			return 1;
		}
		int tcount[] = new int[N];
		
		for (int i = 0; i < trust.length; i++) {
			tcount[trust[i][1] - 1] += 1;
			tcount[trust[i][0] - 1] -= 1;
		}
		for (int i = 0; i < N; i++) {
			if (tcount[i] == (N - 1)) {
				return (i + 1);
			}
		}
		return -1;
	}
}
