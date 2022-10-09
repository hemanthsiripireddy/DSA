package pac5;

public class MinimumLimitofBallsinaBag {
	 public int minimumSize(int[] nums, int maxOperations) {
	        int l=1,r=1_000_000_000;
	        while(l<r){
	            int mid=(l+r)/2,count=0;
	            for(int a:nums){
	                count+=(a-1)/mid;

	            }
	            if(count>maxOperations){
	                l=mid+1;
	            }else{
	                r=mid;
	            }
	        }
	        return l;
	        
	    }

}
