package pac6;

import java.util.Arrays;

public class SumofAbsoluteDifferencesinaSortedArray {
	public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans=new int[nums.length];
        int leftSum=0,rightSum=Arrays.stream(nums).sum();
        for(int i=0;i<nums.length;i++){
            ans[i]=i*nums[i]-leftSum+rightSum-(nums.length-i)*nums[i];
            leftSum+=nums[i];
            rightSum-=nums[i];
        }
        return ans;
        
    }

}
