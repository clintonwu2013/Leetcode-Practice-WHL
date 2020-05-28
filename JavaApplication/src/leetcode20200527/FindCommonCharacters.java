package leetcode20200527;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	public List<String> commonChars(String[] a) {
		List<String> ans=new ArrayList<>();
		//decide which index to use 
		
		int index = index(a);
		String s = a[index];
		// loop over the char of s
		for(int i=0; i<s.length(); i++) {
			//check a and char of s
			if(check(a,s.charAt(i))) {
				//if so, add it to ans and remove it from all of a.
				ans.add(Character.toString(s.charAt(i)));
				a= remove(a,s.charAt(i));
			}
		}
		
		
		
		return ans;
	}

	private String[] remove(String[] a, char charAt) {
		for(int i =0; i< a.length; i++) {
			int idx = a[i].indexOf(charAt);
			a[i] = a[i].substring(0, idx)+a[i].substring(idx+1, a[i].length());
		}
		return a;
	
	}

	private boolean check(String[] a, char charAt) {
		for(int i=0; i<a.length; i++) {
			if(a[i].indexOf(charAt) == -1) {
				return false;
			}
		}
		return true;
	}

	private int index(String[] a) {
		int index = 0;
		int temp = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i].length()<temp) {
				index = i;
				temp = a[i].length();
			}
		}
		return index;
	}
	
}
