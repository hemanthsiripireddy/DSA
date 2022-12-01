package pac10;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BasicCalculatorII {
	 public int calculate(String s) {
         Stack<Integer>num=new Stack<>();
	        Stack<Character>character=new Stack<>();
	        int st=0,i=0,l=s.length();
	        while(i<l){
	            char ch=s.charAt(i);
	            if(ch==' ') {
	             i++;
	            }
	            else if(('0'<=ch&&ch<='9')){
	                i++;
	            }
	            else{
	                int n=Integer.parseInt(s.substring(st,i).trim());
	                num.push(n);
	                if((num.size()>=2)){
	                    if(character.peek()=='*'||character.peek()=='/') {
	                    	int num2=num.pop();
	                        int num1=num.pop();
	                    if(character.peek()=='*'){
	                        
	                        num.push(num1*num2);
	                    }else{
	                        num.push(num1/num2);

	                    }
	                    character.pop();
	                    }
	                }
	                character.push(ch);
	                i++;
	                st=i;
	                

	            }
	        }
	        if(i==l){
	            int n=Integer.parseInt(s.substring(st,i).trim());
	                num.push(n);
	        }
	       if(character.size()>0){
	            if(character.peek()=='*'||character.peek()=='/'){
	            int num2=num.pop();
	                        int num1=num.pop();
	                    if(character.peek()=='*'){
	                        
	                        num.push(num1*num2);
	                    }else{
	                        num.push(num1/num2);

	                    }
	                    character.pop();

	        }
	       }

	     //  int ans=0;
	       List<Integer>arrInt=new ArrayList<>();
	       List<Character>ch1=new ArrayList<>();
	            while(num.size()!=0){
	                arrInt.add(num.pop());
	            }
	            while(character.size()!=0){
	                ch1.add(character.pop());
	            }
	             i=ch1.size()-1;
	             int j=arrInt.size()-1;
	             int ans=arrInt.get(j);
	             j--;
	        while(i>=0){
	        	char ch=ch1.get(i);
	           
	             
	            
	            if(ch=='+'){
	            	ans+=arrInt.get(j);
	                
	            }else{
	                  ans-=arrInt.get(j);
	            }
	            j--;
	            i--;
	        }
	        return ans;
		}
	        
	

}
       