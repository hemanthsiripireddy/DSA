package pac6;

public class MaximumPopulationYear {
	 public int maximumPopulation(int[][] logs) {
	        int[] year=new int[101];
	        for(int[] i:logs){
	            year[i[0]-1950]++;
	            year[i[1]-1950]--;
	        }
	        int maxNum=year[0],maxYear=1950;
	        for(int i=1;i<101;i++){
	            year[i]+=year[i-1];
	            if(maxNum<year[i]){
	                maxNum=year[i];
	                maxYear=1950+i;
	            }
	        }
	        return maxYear;
	        
	    }

}
