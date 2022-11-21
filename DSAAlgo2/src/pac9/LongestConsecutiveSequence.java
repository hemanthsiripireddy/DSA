package pac9;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	 public int longestConsecutive(int[] nums) {
	        Set<Integer>set=new HashSet<>();
	        for(int num:nums){
	            set.add(num);
	        }
	        int ans=0;
	        for(int num:nums){
	            if(!set.contains(num-1)){
	                int cur=1;
	                while(set.contains(num+1)){
	                    cur++;
	                    num++;
	                }
	                ans=Math.max(ans,cur);
	            }
	        }
	        return ans;
	            
	    }

}
