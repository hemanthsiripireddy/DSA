package pac4;

public class LongestUploadedPrefix {
	private int l=0;
	   
	int[] arr;
	    public LongestUploadedPrefix(int n) {
	        arr= new int[n+1];
	        
	    }
	    
	    
	    public void upload(int video) {
	        arr[video]=1;
	        
	    }
	    
	    public int longest() {
	        while(l+1<=arr.length-1){
	            if(arr[l+1]==1){
	                 l++;
	            }
	            else
	                break;
	           
	        }
	        return l;
	        
	        
	    }

}
