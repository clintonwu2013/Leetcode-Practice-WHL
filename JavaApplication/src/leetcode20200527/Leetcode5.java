package leetcode20200527;

public class Leetcode5 {
	public String longestPalindrome(String s) {
		int start = 0, end = 0;
		boolean[][] d = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			d[i][i] = true;
		}

		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) { 
					if (i - j == 1 || d[i - 1][j + 1]) {
						d[i][j] = true;
						if (end - start < i - j) {
							end = i;
							start = j;
						}
					}

				}
			}
		}

		return s.substring(start, end + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
