package pac9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak139 {
	 public boolean wordBreak(String s, List<String> wordDict) {
	        Set<String>set=new HashSet<>();
	        for(int i=0;i<wordDict.size();i++){
	            set.add(wordDict.get(i));
	        }
	        List<Integer>l=new ArrayList<>();
	        boolean ans=false;
	        l.add(0);
	        for(int i=1;i<=s.length();i++){
	            ans=false;
	           for(int j=l.size()-1;j>=0;j--){
	                if(set.contains(s.substring(l.get(j),i))){
	                l.add(i);
	                ans=true;
	                break;
	                }
	           }
	        }
	        return ans;
	    }

}
