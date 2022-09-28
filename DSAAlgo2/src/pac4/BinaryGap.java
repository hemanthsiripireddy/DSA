package pac4;

public class BinaryGap {
	 public int binaryGap(int n) {
	        String str="";int i=31;
	        while(i>=0){
	            if(n>=Math.pow(2,i)){
	                str+=1;
	                  n-=Math.pow(2,i);
	                
	            }else{
	                str+=0;
	            }
	            
	          
	            i--;
	        }
	        int l=str.length(),start=0,end=0,max=0,j=0;
	        System.out.println(str);
	        
	        while(end<l){
	            if(str.charAt(end)=='1'){
	            	if(j==0) {
	            		start=end;
	            		j++;
	            	}
	                max=Math.max(max,end-start);
	                start=end;
	            }
	            end++;
	            
	        }
	        return max;
	    }

}
