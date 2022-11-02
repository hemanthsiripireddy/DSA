package pac7;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	 public List<String> letterCombinations(String digits) {
	        LinkedList<String>ans=new LinkedList<>();
	        if(digits.isEmpty())return ans;
	        String[] mapping=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	       // String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        ans.add("");
	        while(ans.peek().length()!=digits.length()){
	            String s=ans.remove();
	            int x=digits.charAt(s.length())-'0';
	            for(char ch:mapping[x].toCharArray()){
	                ans.add(s+ch);
	            }
	        }
	        return ans;
	        
	    }

}
