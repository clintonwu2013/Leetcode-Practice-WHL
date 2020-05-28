package leetcode20200527;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode1122 {
//	Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//	Output: [2,2,2,1,4,3,3,9,6,7,19]
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //HashMap for counting sort: Stores frequency 'map[i]' for element 'i'
        int[] map=new int[1001];
        
        //Counting sort on arr1 to fill hashmap
        for(int ele1:arr1) {
        	map[ele1] = map[ele1]+1;
        }
        int idx = 0;
        //Starting from index 0 in arr1 -> Fill all the arr2 elements from hashmap into arr1, and update element frequency in hashmap
        for(int z: arr2) {
        	while(map[z]-- >0) {
        		arr1[idx++] = z;
        	}
        	
        }
        
        //Similarly fill all other elements in hashmap and update their frequency
        for(int i=0; i<map.length;i++) {
        	while(map[i]-- >0) {
        		arr1[idx++] = i;
        	}
        }
        return arr1;
    }
}
