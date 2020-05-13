package leetcode20200513;

import java.util.HashMap;
import java.util.Map;

public class Leetcode299 {
	public String getHint(String secret, String guess) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i=48; i<58; i++) {
			map1.put((char)i, 0);
			map2.put((char)i, 0);
		}
		int A = 0;
		for(int i=0; i< secret.length(); i++) {
			
			map1.put(secret.charAt(i), map1.get(secret.charAt(i))+1);
			map2.put(guess.charAt(i), map2.get(guess.charAt(i))+1);
			
			if(secret.charAt(i) == guess.charAt(i)) {
				A++;
			}
			
		}
		int B = 0;
		for(int i =48; i<58; i++) {
			if((map1.get((char)i) != 0 ) && (map2.get((char)i) != 0 )) {
				B = B + Math.min(map1.get((char)i), map2.get((char)i));
			}
		}
		
		B = B-A;
		return A+"A"+B+"B";
	}
	
	public String getHint2(String secret, String guess) {
		int[] freq = new int[10];
		// calculate the frequency of secret
		for(char c: secret.toCharArray()) {
			freq[c-'0'] += 1;
		}
		int bulls = 0;
		int totalMatch = 0;
		//compare secrtet and guess, and count bulls and totalMatch
		for(int i=0; i<secret.length(); i++) {
			
			int s = secret.charAt(i);
            int g = guess.charAt(i);
            
            if( s == g) {
            	bulls++;
            }
			int tmp = freq[g-'0'];
			if(tmp > 0) {
				totalMatch++;
				freq[g-'0'] = freq[g-'0'] -1;
			}
			
		}
		return bulls+"A"+(totalMatch-bulls)+"B";
	}
	public static void main(String[] args) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i=48; i<58; i++) {
			map1.put((char)i, 0);
			map2.put((char)i, 0);
		}
		System.out.println(map1);
	}
}
