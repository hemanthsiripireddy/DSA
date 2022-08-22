package pac2;

public class MaxSumSubArray {//kandane's algorithm
	  public int maxSubArray(int[] nums) {
		   //     if(nums.length==1)return nums[0];
		        int maxSum=-Integer.MAX_VALUE,currentSum=0;
		        for(int i=0;i<nums.length;i++){
		             currentSum+=nums[i];
		            if(maxSum<currentSum)
		                maxSum=currentSum;
		          
		            if(currentSum<0)
		                currentSum=0;
		             
		        }
		        return maxSum;
		        
		    }

}
