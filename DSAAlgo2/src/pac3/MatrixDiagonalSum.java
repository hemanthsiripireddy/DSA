package pac3;

public class MatrixDiagonalSum {
	 public int diagonalSum(int[][] mat) {
	        int sum=0,n=mat.length;
	        for(int i=0;i<n;i++){
	            if(i!=n-i-1)
	            sum+=mat[i][i]+mat[i][n-i-1];
	            else
	                sum+=mat[i][i];
	        }
	        return sum;
	    }

}
