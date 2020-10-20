package leetcode20201020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode819 {
	public String mostCommonWord(String paragraph, String[] banned) {
		String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
		String[] words = normalizedStr.split("\\s+");
		Set<String> bannedWords = new HashSet();
        
		for (String word : banned) {
        	bannedWords.add(word);
        }    
        
		Map<String, Integer> map = new HashMap<>();
		for(String word: words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		String mostCommonWord = null;
		int max = -1;
		for(String key:map.keySet()) {
			int times = map.get(key);
			if(times > max && !bannedWords.contains(key)) {
				max = times;
				mostCommonWord = key;
			}
		}
		return mostCommonWord;
	}
	
}
