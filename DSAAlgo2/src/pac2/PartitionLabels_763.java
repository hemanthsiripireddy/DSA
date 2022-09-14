package pac2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels_763 {
	 public List<Integer> partitionLabels(String s) {
	        Map<Character,Integer>map=new HashMap<>();
	        List<Integer>lst=new ArrayList<>();
	        for(int i=0;i<s.length();i++){
	            map.put(s.charAt(i),i);
	        }
	        int prev=-1;
	        int max=0;
	        for(int i=0;i<s.length();i++){
	            max=Math.max(max,map.get(s.charAt(i)));
	            if(i==max){
	                lst.add(max-prev);
	                prev=max;
	                max=0;
	            }
	           
	            
	        }
	         return lst;
	    }

}
