package pac8;

public class CountandSay {
	  StringBuilder str=new StringBuilder();
	    public String countAndSay(int n) {
	       // StringBuilder str=new StringBuilder();
	        str.append("1");
	        if(n==1)
	        return str.toString();
	        for(int i=2;i<=n;i++){

	            helper(i);
	            
	        }
	        return str.toString();

	        
	    }
	    public void helper(int n){
	        StringBuilder str1=new StringBuilder();
	            char ch=str.charAt(0);
	            int count=1;
	            for(int i=1;i<str.length();i++){
	                if(ch==str.charAt(i)){
	                    count++;
	                }
	                else{
	                    str1.append(count+""+ch);
	                    ch=str.charAt(i);
	                    count=1;
	                }

	            }
	             str1.append(count+""+ch);
	             str=str1;

	    }

}
