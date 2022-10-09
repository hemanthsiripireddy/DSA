package pac6;

import java.util.HashMap;
import java.util.Map;

public class NumberofGoodPairs {
	public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       for(Map.Entry<Integer,Integer>entry:map.entrySet()){
           int val=entry.getValue();
           count+=(val*(val-1))/2;
       }
       return count;
        
    }

}
