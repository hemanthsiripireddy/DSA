package pac6;

public class FindValidMatrixGivenRowandColumnSums {
	 public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
	        int[][] ans=new int[rowSum.length][colSum.length];
	        for(int i=0;i<rowSum.length;i++){
	            for(int j=0;j<colSum.length;j++){
	                if(rowSum[i]<colSum[j]){
	                    ans[i][j]=rowSum[i];
	                    colSum[j]-=rowSum[i];
	                    rowSum[i]=0;
	                }else{
	                    ans[i][j]=colSum[j];
	                    rowSum[i]-=colSum[j];
	                    colSum[j]=0;
	                }
	            }
	        }
	        return  ans;
	        
	    }

}
