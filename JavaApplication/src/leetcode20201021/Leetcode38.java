package leetcode20201021;

public class Leetcode38 {
	public String countAndSay(int n) {
		if(n==1) {
			return "1";
		}
		
		String s = countAndSay(n-1);
		
		return buildStr2(s);

	}
	
	// using two pointers, we will count characters and build the new string
//    private String buildStr(String s) {
//        StringBuilder sb = new StringBuilder();
//        int i=0, j=1; 
//        while(i<j && j<=s.length()) {
//            while(j<s.length() && s.charAt(i) == s.charAt(j)) {
//                j++;
//            }
//            sb.append(j-i+""); // count of number
//            sb.append(s.charAt(i)); // number itself
//            i=j;
//            j++;
//        }
//        return sb.toString();
//    }
    
 // using two pointers, we will count characters and build the new string
    private String buildStr2(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=1;
        
        while(i<j && j<=s.length()) {
        	
        	while(j<s.length() && s.charAt(i) == s.charAt(j)) {
        		j++;
        	}
        	sb.append(j-i+"");
        	sb.append(s.charAt(i));
        	i=j;
        	j++;
        }
        return sb.toString();
    }
}
