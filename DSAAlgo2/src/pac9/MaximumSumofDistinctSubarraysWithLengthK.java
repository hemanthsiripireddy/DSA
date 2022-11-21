package pac9;

public class MaximumSumofDistinctSubarraysWithLengthK {
	  public long maximumSubarraySum(int[] nums, int k) {
	        int[] arr=new int[100005];
	        int dup=0;
	        long sum=0,ans=0;
	        for(int i=0;i<k-1;i++){
	            if(++arr[nums[i]]>=2)dup++;
	            sum+=nums[i];
	        }
	        for(int i=k-1;i<nums.length;i++){
	            sum+=nums[i];
	            if(++arr[nums[i]]>=2)dup++;
	            if(dup==0){
	                ans=Math.max(ans,sum);
	            }
	            sum-=nums[i-(k-1)];
	            if(--arr[nums[i-(k-1)]]>=1)dup--;
	        }
	        return ans;
	        
	    }

}
