package pac9;

public class NumberofSubarraysWithLCMEqualtoK {
	 public int subarrayLCM(int[] nums, int k) {
	        int g=-1,count=0;
	        for(int i=0;i<nums.length;i++){
	            g=-1;
	            for(int j=i;j<nums.length;j++){
	                if(g==-1){
	                    g=nums[j];
	                }
	                else {
	                    g=lcm(g,nums[j]);
	                }
	                if(k%g==0){
	                    if(k==g)
	                        count++;
	                }else
	                    break;
	               
	                
	            }
	            
	        }
	        return count;
	       
	    }
	     private int lcm(int a,int b){
	           int absHigherNumber = Math.max(a, b);
	    int absLowerNumber = Math.min(a, b);
	    int lcm = absHigherNumber;
	    while (lcm % absLowerNumber != 0) {
	        lcm += absHigherNumber;
	    }
	    return lcm;
	        }

}
