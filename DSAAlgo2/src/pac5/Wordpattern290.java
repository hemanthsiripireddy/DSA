package pac5;

import java.util.HashMap;
import java.util.Map;

public class Wordpattern290 {
	 public boolean wordPattern(String pattern, String s) {
	        String[] str= s.split(" ");
	        if(str.length!=pattern.length())
	        return false;
	        Map<Character,Integer> set= new HashMap<>();
	        Map<String,Integer>set1=new HashMap<>();
	        for(Integer i=0;i<str.length;i++){
	            if(set.put(pattern.charAt(i),i)!=set1.put(str[i],i))
	            return false;
	        }
	        return true;
	        
	    }

}
