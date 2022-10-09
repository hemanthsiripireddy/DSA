package pac6;

import java.util.Arrays;

public class ThreeSumClosest {
	 public int threeSumClosest(int[] nums, int target) {
	        int ans=Integer.MAX_VALUE,diff=Integer.MAX_VALUE,sum=0;
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-2;i++){
	            int low=i+1,high=nums.length-1;
	            while(low<high){
	                 sum=nums[i]+nums[low]+nums[high];
	                if(Math.abs(sum-target)<diff){
	                    diff=Math.abs(sum-target);
	                    ans=sum;
	                }
	                if(target==sum)
	                break;
	                if(sum<target){
	                    low++;
	                }else{
	                    high--;
	                }
	            }
	            if(sum==target)
	            break;
	            
	        }
	        return ans;
	        
	    }

}
