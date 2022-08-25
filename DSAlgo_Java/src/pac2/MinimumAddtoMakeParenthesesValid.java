package pac2;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
	 public int minAddToMakeValid(String s) {
	        int count=0;
	      Stack<Character>stack=new Stack<Character>();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('){
	                stack.push(s.charAt(i));
	            }else if(stack.size()>0){
	                if(stack.peek()=='('){
	                    stack.pop();
	                }
	                else
	                    count++;
	                    
	            }else
	                count++;
	        }
	       return count+stack.size();
	        
	    }

}
