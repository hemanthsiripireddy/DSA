package pac8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
	        List<String>list=new ArrayList<>();
	        List<List<String>>ans=new ArrayList<>();
	        for(int i=0;i<strs.length;i++){
	             char tempArray[] = strs[i].toCharArray();
	              Arrays.sort(tempArray);
	             String s=new String(tempArray);
	             if(list.contains(s)){
	                 int in=list.indexOf(s);
	                 ans.get(in).add(strs[i]);
	             }else{
	                 List<String>l=new ArrayList<>();
	                 l.add(strs[i]);
	                 ans.add(l);
	                 list.add(s);
	             }
	        }
	        return ans;
	    }

}
