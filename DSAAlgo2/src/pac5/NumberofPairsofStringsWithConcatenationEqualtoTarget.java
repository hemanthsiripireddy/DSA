package pac5;

import java.util.HashMap;
import java.util.Map;

public class NumberofPairsofStringsWithConcatenationEqualtoTarget {
	 public int numOfPairs(String[] nums, String target) {
	        Map<String,Integer>map=new HashMap<>();
	        int l=target.length(),ans=0;
	        for(int i=0;i<nums.length;i++){
	            int m=nums[i].length();
	            if(target.startsWith(nums[i])){
	                String suffix=target.substring(m);
	                if(map.containsKey(suffix)){
	                    ans+=map.get(suffix);
	                }
	            }
	              if(target.endsWith(nums[i])){
	                String prefix=target.substring(0,l-m);
	                if(map.containsKey(prefix)){
	                    ans+=map.get(prefix);
	                }
	            }
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }
	        return ans;
	        
	    }

}
