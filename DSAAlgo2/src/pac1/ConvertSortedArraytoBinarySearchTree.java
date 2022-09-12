package pac1;

public class ConvertSortedArraytoBinarySearchTree {
	 public TreeNode sortedArrayToBST(int[] nums) {
	        return helper(nums,0,nums.length-1);
	        
	    }
	    public TreeNode helper(int[] nums,int left,int right){
	        
	        if(left>right)
	            return null;
	        int mid=(left+right)/2;
	        TreeNode temp=new TreeNode(nums[mid]);
	        temp.left=helper(nums,left,mid-1);
	        temp.right =helper(nums,mid+1,right);
	        return temp;
	        
	    }

}
