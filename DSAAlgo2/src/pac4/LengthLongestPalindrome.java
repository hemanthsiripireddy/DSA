package pac4;

import java.util.HashMap;
import java.util.Map;

public class LengthLongestPalindrome {
	 public int longestPalindrome(String s) {
	        Map<Character,Integer>map=new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	        }
	        int j=0,l=0;
	        for(Map.Entry<Character,Integer> entry : map.entrySet()){
	            if((entry.getValue()==1&&j==0) ||(entry.getValue()%2==1&&j==0)){
	                l++;
	                j++;
	                
	            }
	            if(entry.getValue()%2==0)
	            l+=entry.getValue();
	            else
	                l+=entry.getValue()-1;
	            
	        }
	        return l;
	        

}
}
