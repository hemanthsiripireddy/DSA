package pac4;

import java.util.Arrays;

public class DetectPatternofLengthMRepeatedKorMoreTimesMethod2 {
	 public boolean containsPattern(int[] arr, int m, int k) {
	        for(int i=0;i<arr.length-m;i++){
	            int[] currentArray=Arrays.copyOfRange(arr,i,i+m);
	            int count=1;
	            for(int j=i+m;j<arr.length;j+=m){
	                int[] nextArray=Arrays.copyOfRange(arr,j,j+m);
	                if(Arrays.equals(currentArray,nextArray))
	                     count++;
	                else
	                    break;
	               
	                
	            }
	             if(count>=k)
	                    return true;
	                
	        }
	        return false;
	        
	    }

}
