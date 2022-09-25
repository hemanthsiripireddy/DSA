package pac3;

public class LongestSubarrayWithMaximumBitwiseAND {
	public int longestSubarray(int[] nums) {
        int max=0,maxLength=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                maxLength=Math.max(maxLength,i-start+1);
                
            }
            else{
                start=i+1;
            }
        }
        return maxLength;
        
    }

}
