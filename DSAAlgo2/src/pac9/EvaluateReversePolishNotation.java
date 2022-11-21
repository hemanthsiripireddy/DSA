package pac9;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	  public int evalRPN(String[] tokens) {
	        if(tokens.length==1)
	        return Integer.parseInt(tokens[0]);
	        Stack<String>stack=new Stack<>();

	        stack.push(tokens[0]);
	        stack.push(tokens[1]);
	        int ans=0;
	        for(int i=2;i<tokens.length;i++){
	            if(tokens[i].equals("+")){
	               
	                    int x=Integer.parseInt(stack.pop());
	                    int y=Integer.parseInt(stack.pop());
	                    ans=(x+y);
	                    stack.push(ans+"");
	                
	                
	            }
	            else  if(tokens[i].equals("-")){
	               
	                    int x=Integer.parseInt(stack.pop());
	                    int y=Integer.parseInt(stack.pop());
	                    ans=(y-x);
	                    stack.push(ans+"");
	                
	                
	            }
	            else  if(tokens[i].equals("*")){
	              
	                    int x=Integer.parseInt(stack.pop());
	                    int y=Integer.parseInt(stack.pop());
	                    ans=(x*y);
	                    stack.push(ans+"");
	                
	                
	            }
	            else  if(tokens[i].equals("/")){
	              
	                    int x=Integer.parseInt(stack.pop());
	                    int y=Integer.parseInt(stack.pop());
	                    ans=(y/x);
	                    stack.push(ans+"");
	                
	               
	            }
	            else {
	                stack.push(tokens[i]);
	            }
	        }
	        return Integer.parseInt(stack.pop());
	        
	    }

}
