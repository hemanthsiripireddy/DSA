package pac8;

public class SetMatrixZeroes2 {
	public void setZeroes(int[][] matrix) {
        int col0=1,row=1;
        
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0)
            row=0;
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)col0=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            if(col0==0){
                matrix[i][0]=0;

            }
        }
         for(int i=0;i<matrix[0].length;i++){
            if(row==0){
                matrix[0][i]=0;

            }
        }
        
    }

}
