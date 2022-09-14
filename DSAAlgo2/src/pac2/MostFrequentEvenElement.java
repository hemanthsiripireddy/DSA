package pac2;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
	 public int mostFrequentEven(int[] nums) {
	        Map<Integer,Integer>map=new HashMap<>();
	        int f=0,val=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]%2==0){
	                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	                if(f<map.get(nums[i])||f==map.get(nums[i])&&nums[i]<val){
	                    f=map.get(nums[i]);
	                    val=nums[i];
	                }
	            }
	        }if(val<Integer.MAX_VALUE)
	        return val;
	        return -1;
	        
	    }

}
