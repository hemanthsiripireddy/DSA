package general;

public class SearchInRoatedSortedArray {
	 public int search(int[] nums, int target) {
		  int start=0,end=nums.length-1,ans=-1;
	        
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(target >=nums[0]&&nums[mid]<nums[0])
	                end=mid-1;
	            else if(nums[mid]>=nums[0]&& target<nums[0])
	                start=mid+1;
	            else{
	                if(target>nums[mid])
	                    start=mid+1;
	                else if(target<nums[mid])
	                    end=mid-1;
	                else{
	                    ans=mid;
	                    break;
	                }
	            }
	        }
	        return ans;
	 }
	 
}
