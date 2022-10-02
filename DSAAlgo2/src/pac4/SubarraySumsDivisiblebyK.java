package pac4;

public class SubarraySumsDivisiblebyK {
	 public int subarraysDivByK(int[] nums, int k) {
	        int[] hash=new int[k];
	        int sum=0;
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            hash[((sum%k)+k)%k]++;

	        }
	        int ans=hash[0];
	        for(int i=0;i<k;i++){
	            ans+=(hash[i]*(hash[i]-1))/2;//+hash[i];

	        }
	        return ans;

	        
	    }

}
