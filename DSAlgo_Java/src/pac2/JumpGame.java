package pac2;

public class JumpGame {
	 public boolean canJump(int[] nums) {
	        int i=1,maxReachable=nums[0];
	        while(i<nums.length&&maxReachable>=i){
	            if(i+nums[i]>maxReachable)
	                maxReachable=i+nums[i];
	            i++;
	        }
	        if(maxReachable>=nums.length-1)
	            return true;
	        return false;
	        
	    }

}
