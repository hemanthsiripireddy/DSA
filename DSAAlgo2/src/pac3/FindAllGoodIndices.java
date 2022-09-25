package pac3;

import java.util.ArrayList;
import java.util.List;

public class FindAllGoodIndices {
	 public List<Integer> goodIndices(int[] nums, int k) {
	        int prefix[]=new int[nums.length];
	        prefix[0]=1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]<=nums[i-1]){
	                prefix[i]=prefix[i-1]+1;
	            }
	            else{
	                prefix[i]=1;
	            }
	        }
	        int postfix[]=new int[nums.length];
	        postfix[nums.length-1]=1;
	        for(int i=nums.length-2;i>=0;i--){
	            if(nums[i]<=nums[i+1]){
	                postfix[i]=postfix[i+1]+1;
	            }
	            else{
	                postfix[i]=1;
	            }
	        }
	        int i=k;
	        List<Integer>lst=new ArrayList<Integer>();
	        while(i<nums.length-k){
	            if(prefix[i-1]>=k&&postfix[i+1]>=k){
	                lst.add(i);
	                
	            }
	            i++;
	            
	            
	        }
	        return lst;
	        
	    }

}
