package leetcode20201020;

public class Leetcode1108 {
	public String defangIPaddr(String address) {
		char[] chars = address.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : chars) {
			if(c == '.') {
				sb.append("[.]");
				
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
