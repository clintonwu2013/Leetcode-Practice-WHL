package leetcode20200513;

public class Leetcode344 {
	public void reverseString(char[] s) {
        helper(s, 0, s.length-1);
    }
    
    void helper(char[] s, int left, int right) {
        
        if(left>right) {
            return;
        }
       
        helper(s, left+1, right-1);
        char temp = s[right];
        s[right] = s[left];
        s[left] = temp;
    }
}
