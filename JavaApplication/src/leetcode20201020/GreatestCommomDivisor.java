package leetcode20201020;

public class GreatestCommomDivisor {
     public static int findGCD(int m, int n) {
		if(m<n) {
			return findGCD(n,m);
		}
		int residue = m%n;
		if(residue != 0) {
			return findGCD(n,residue);
			
		}
	    return n;	
		
		
    	 
     }
     public static void main(String[] args) {
    	 int ans = GreatestCommomDivisor.findGCD(490,70);
         System.out.println(ans);
     }
}
