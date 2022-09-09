package pac1;

public class MaxConsecutiveOnesIII {
	public int longestOnes(int[] nums, int k) {
        int i=0,j=0,l=0,count=0;
        while(j<nums.length){
            if(nums[j]==0)
                count++;
            if(count<=k){
                l=Math.max(l,j-i+1);
                
            }else{
                while(count>k){
                    if(nums[i]==0)count--;
                    i++;
                }
            }
            j++;
                
        }
        return l;
        
    }

}
