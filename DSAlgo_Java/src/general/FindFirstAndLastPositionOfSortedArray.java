package general;

public class FindFirstAndLastPositionOfSortedArray {
	public int[] searchRange(int[] nums, int target) {
		int left=leftPosition(nums,target);
		int rigth=rigthPosition(nums,target);
	int[] ans=new int[2];
	ans[0]=left;
	ans[1]=rigth;
	return ans;

	        
	        
	    }
	public int leftPosition(int nums[],int target) {
		int start=0,end=nums.length-1;
		int ans=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}else {
				ans=mid;
				end=mid-1;
				
			}
			
			
		}
		return ans;
	}
	public int rigthPosition(int nums[],int target) {
		int start=0,end=nums.length-1;
		int ans=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}else {
				ans=mid;
				start=mid+1;
				
			}
			
			
		}
		return ans;
	}

}
