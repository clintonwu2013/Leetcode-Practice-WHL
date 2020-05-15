package leetcode20200513;

public class Leetcode53 {
	

	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length ==0) {
			return 0;
		}
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		int beg = 0;
		int end = 0;
		int currentStartIndex = 0;
		int currentEndIndex = 0;
		for(int i =0; i<nums.length; i++) {
			currentEndIndex = i;
			currSum = currSum + nums[i];
			
			// if you found local max ---> update maxSum, beg, end  
			if(currSum > maxSum) {
				maxSum = currSum;
				end = currentEndIndex;
				beg = currentStartIndex;
			}
			
			// if currSum < 0 ---> update currentStartIndex 
			if(currSum < 0) {
				currSum = 0;
				currentStartIndex = currentEndIndex+1;
			}
		}
		System.out.println("beg="+beg);
		System.out.println("end="+end);
		return maxSum;
	}
	
	
	public int maxSubArray2(int[] nums) {
		if(nums == null || nums.length ==0) {
			return 0;
		}
		int sumMax = Integer.MIN_VALUE;
		int currSum = 0;
		int beg = 0;
		int end = 0;
		
		int currBeg = 0;
		int currEnd = 0;
		
		for(int i=0; i<nums.length; i++) {
			currSum = currSum + nums[i];
			// if you found local max ---> update maxSum, beg, end  
			currEnd = i;
			if(currSum > sumMax) {
				sumMax = currSum;
				beg = currBeg;
				end = currEnd;
			}
			
			// if currSum < 0 ---> update currSum currentStartIndex
			if(currSum < 0) {
				currSum = 0;
				currBeg = currEnd +1;
			}
			
		}
			
		System.out.println("beg="+beg);	
		System.out.println("end="+end);	
		
		return sumMax;
	}
	
	
	public int maxSubArray3(int[] nums) {
		if(nums == null || nums.length ==0) {
			return 0;
		}
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i< nums.length; i++) {
			
			int tmpSum = nums[i];
			if(tmpSum > maxSum) {
				maxSum = tmpSum;
			}
			for(int j=i+1; j<nums.length; j++) {
				tmpSum = nums[j]+ tmpSum;
				
				if(tmpSum > maxSum) {
					maxSum = tmpSum;
				}
			}
		}
		return maxSum;
	}
	
	public int maxSubArray4(int[] nums) {
		if(nums == null || nums.length ==0) {
			return 0;
		}
		int maxSum = Integer.MIN_VALUE;
		int tmpSum =0 ;
		for(int i=0; i< nums.length; i++) {
			tmpSum = tmpSum + nums[i];
			
			if(tmpSum>maxSum) {
				maxSum = tmpSum;
			}
			if(tmpSum < 0) {
				tmpSum = 0;
			}
			
		}
		return maxSum;
	}
	
	
}
