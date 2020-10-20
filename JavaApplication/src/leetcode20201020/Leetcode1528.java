package leetcode20201020;

public class Leetcode1528 {
	public String restoreString(String s, int[] indices) {
		StringBuilder sb = new StringBuilder();
		char[] schar = new char[s.length()];
		int i =0;
		for(int idx : indices) {
			schar[idx] = s.charAt(i++);
		}
		for(char c: schar) {
			sb.append(c);
		}
		return sb.toString();
	}
}
