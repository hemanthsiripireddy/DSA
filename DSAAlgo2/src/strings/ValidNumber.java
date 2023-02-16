package strings;

public class ValidNumber {
	public static void method() {
		String s="4e+";
		boolean res=isNumber(s);
		System.out.println(res);
		
		
	}
	 public static  boolean isNumber(String s) {

	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='e'||s.charAt(i)=='E'){
	                if(i==0)
	                return false;
	                if(s.length()==1)
	                return false;
	                return onlyInteger(s,i+1);
	            }
	            if(i==0&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
	                continue;
	            }
	            if(s.charAt(i)=='.'){
	                if(s.length()==1)
	                return false;
	                return afterDot(s,i+1);
	            }
	            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
	            continue;
	            return false;
	        }
	        return true;
	        
	    }
	    public static boolean onlyInteger(String s,int i){
	        if(i==s.length())
	        return false;
	        for(int j=i;j<s.length();j++){
	          if(j==i&&((s.charAt(i)=='+'||s.charAt(i)=='-')&&j!=s.length()-1))
	          continue;
	              if(s.charAt(j)>='0'&&s.charAt(j)<='9')
	            continue;
	            return false;
	            
	        }
	        return true;
	    }
	    public static boolean afterDot(String s,int i){
	        for(int j=i;j<s.length();j++){
	              if(s.charAt(j)>='0'&&s.charAt(j)<='9')
	            continue;
	              if(i-1!=0&&s.charAt(j)=='e'||s.charAt(j)=='E')
	               
	                return onlyInteger(s,j+1);
	                else
	                return false;

	            
	            
	            
	        }
	        return true;
	    }

}
