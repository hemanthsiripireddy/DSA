package pac5;

public class MinimumValuetoGetPositiveStepbyStepSum {
	 public int minStartValue(int[] nums) {
	        int minValue=0,minPrefixSum=0;
	        for(int i=0;i<nums.length;i++){
	            minPrefixSum+=nums[i];
	            if(minPrefixSum<minValue){
	                minValue=minPrefixSum;
	            }
	        }
	        return -minValue+1;
	    }

}
