package pac8;

public class UniquePaths {
	int[][] arr;
    int m1=0,n1=0;
    public int uniquePaths(int m, int n) {
        arr=new int[m][n];
        m1=m;
        n1=n;
        helper(0,0);
        return helper(0,0);

        
    }
    public int helper(int i, int j){
        if(i<m1&&j<n1){
            if(arr[i][j]!=0)return arr[i][j];
        if(i==m1-1&&j==n1-1)
        return 1;
        
            arr[i][j]=helper(i+1,j)+helper(i,j+1); 
        
       
        return arr[i][j];

        }else
        return 0;
    }

}
