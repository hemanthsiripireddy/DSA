package pac10;

public class KthLargestElementinanArray {
	 public int findKthLargest(int[] nums, int k) {
	        k=nums.length-k;
	        return quickSelect(0,nums.length-1,k,nums);
	      
	        
	    }
	    public int quickSelect(int l,int r,int k,int[] nums){
	       int  pivot=nums[r],p=l;
	       for(int i=l;i<r;i++){
	           if(nums[i]<=pivot){
	               int temp=nums[i];
	               nums[i]=nums[p];
	               nums[p]=temp;
	               p++;
	           }
	       }
	       int temp=nums[p];
	       nums[p]=nums[r];
	       nums[r]=temp;
	       if(p<k)quickSelect(p+1,r,k,nums);
	       else if(p>k)quickSelect(l,p-1,k,nums);
	       return nums[k];
	    }

}
