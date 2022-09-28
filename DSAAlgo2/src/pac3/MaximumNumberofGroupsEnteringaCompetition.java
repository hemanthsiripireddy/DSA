package pac3;

public class MaximumNumberofGroupsEnteringaCompetition {
	 public int maximumGroups(int[] grades) {
	        int j=1,l=grades.length;
	        while(l-j>=0){
	            l-=j;
	            //i++;
	            j++;
	        }
	        return j-1;
	        
	        
	    }

}
