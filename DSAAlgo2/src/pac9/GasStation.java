package pac9;

public class GasStation {
	  public int canCompleteCircuit(int[] gas, int[] cost) {
	        int ans=0,total=0,gasAmount=0;
	        for(int i=0;i<gas.length;i++){
	            total+=(gas[i]-cost[i]);
	            gasAmount+=(gas[i]-cost[i]);
	            if(gasAmount<0){
	                gasAmount=0;
	                ans=i+1;
	            }
	        }
	        return total<0?-1:ans;
	        
	    }

}
