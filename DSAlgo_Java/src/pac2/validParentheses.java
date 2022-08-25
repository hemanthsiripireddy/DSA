package pac2;

import java.util.Stack;

public class validParentheses {
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        int l=s.length(),i=0;
	        if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}')
	            return false;
	        while(i<l){
	            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
	                stack.push(s.charAt(i));
	            }else if(stack.size()>0){
	                if(s.charAt(i)==')'&&stack.pop()!='(')return false;
	                if(s.charAt(i)=='}'&&stack.pop()!='{')return false;
	                if(s.charAt(i)==']'&&stack.pop()!='[')return false;
	            }
	            else
	                return false;
	            i++;
	        }
	        if(stack.size()==0)
	        return true;
	        return false;
	        
	    }

}
