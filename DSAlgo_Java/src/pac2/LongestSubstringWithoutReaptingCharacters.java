package pac2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutReaptingCharacters {
	 public int lengthOfLongestSubstring(String s) {
	        int ans=0,n=s.length();
	        Map<Character,Integer> map=new HashMap<>();
	        int fp=0,sp=0;
	        while(sp<n){
	             addMap(map,s.charAt(sp));
	            while(!isValid(map)&&fp<sp){
	                deleteMap(map,s.charAt(fp));
	                fp++;
	                
	            }
	             int val=sp-fp+1;
	        ans=Math.max(ans,val);
	           
	            sp++;
	            
	        }
	        return ans;
	       
	        
	    }
	    public void addMap(Map<Character,Integer>map,Character ch){
	    if(!map.containsKey(ch))
	    map.put(ch,1);
	    else
	        map.put(ch,map.get(ch)+1);
	}
	public void deleteMap(Map<Character,Integer>map,Character ch){
	    map.put(ch,map.get(ch)-1);
	}
	public boolean isValid(Map<Character,Integer>map){
	    for(char ch:map.keySet()){
	        if(map.get(ch)>1)
	            return false;
	    }
	    return true;
	    
	}

}
