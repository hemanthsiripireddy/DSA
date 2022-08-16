package general;

public class ProductOfArrayExceptSelf {
	  public int[] productExceptSelf(int[] nums) {
	        int[] left=new int[nums.length];
	        int[] rigth=new int[nums.length];
	        int l= nums.length;
	       left[0]=1;
	        for(int i=1;i<l;i++){
	            left[i]=left[i-1]*nums[i-1];
	        }
	          rigth[l-1]=1;
	                for(int i=l-2;i>=0;i--){
	            rigth[i]=rigth[i+1]*nums[i+1];
	        }

	      
	        for(int i=0;i<nums.length;i++){
	            nums[i]=left[i]*rigth[i];
	        }
	        return nums;
	        
	    }

}
