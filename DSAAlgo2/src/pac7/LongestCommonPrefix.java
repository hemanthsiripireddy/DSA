package pac7;

public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
	        String str="";
	        int st=0;
	        if(strs.length==0)
	        return str;
	        int l=Integer.MAX_VALUE;
	        for(int i=0;i<strs.length;i++){
	            l=Math.min(l,strs[i].length());

	        }
	        for(int i=0;i<l;i++){
	            char ch=strs[0].charAt(i);
	            for(int j=1;j<strs.length;j++){
	                if(strs[j].charAt(i)!=ch){
	                    st=1;
	                    break;
	                    
	                }
	                
	        }

	        if(st==1)
	        break;
	        str+=ch;
	        }
	        
	         return str;
	        
	    }

}
