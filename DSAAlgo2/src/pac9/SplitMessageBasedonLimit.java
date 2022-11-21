package pac9;

import java.util.ArrayList;
import java.util.List;

public class SplitMessageBasedonLimit {
	 private int findDigitCount(int n){
	        int count=0;
	        while(n>0){
	            count++;
	            n/=10;
	        }
	        return count;
	    }
	    public List<String> findSolution(String message,int limit,int size,int numOfDigits){
	        if(limit<=5)
	            return new ArrayList<>();
	        int curr=1;
	      List<String>ans=new ArrayList<>();
	        for(int i=0;i<message.length();){
	              int rem=limit-(3+numOfDigits+findDigitCount(curr));
	            if(rem<=0)
	                return new ArrayList<>();
	            rem=Math.min(rem,message.length()-i);
	            String x=message.substring(i,i+rem);
	            x=x+"<"+curr+"/"+size+">";
	            ans.add(x);
	            i=i+rem;
	            curr++;
	            
	            
	        }
	        return ans;
	    }
	    public String[] splitMessage(String message, int limit) {
	        List<String>ans=new ArrayList<>();
	        int flag=0,dig=1;
	        
	        int i=9;
	       while(i<10000){
	           ans=findSolution(message,limit,i,dig);
	           if(findDigitCount(ans.size())==dig){
	               flag=1;
	               break;
	           }
	           i=i*10+9;
	           dig++;
	           
	       }
	        if(flag==0){
	            return new String[]{};
	        }
	        String[] finalAns=new String[ans.size()];
	        ans=findSolution(message,limit,ans.size(),findDigitCount(ans.size()));
	        for( i=0;i<ans.size();i++){
	            finalAns[i]=ans.get(i);
	            
	        }
	        return finalAns;
	        
	    }

}
