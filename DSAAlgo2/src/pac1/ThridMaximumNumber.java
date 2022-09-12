package pac1;

import java.util.Arrays;

public class ThridMaximumNumber {
	public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
       int k=1,n=nums.length-1;
        while(k<3&&n>0){
            if(nums[n]!=nums[n-1]){
                k++;
            }
            n--;
        }
        if(k<3)
            return nums[nums.length-1];
        return nums[n];
        
	}
}
