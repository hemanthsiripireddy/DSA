package pac5;

public class MaximumSumofanHourglass {
	public int maxSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] preSum=new int[m][n+1];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                preSum[i][j+1]=preSum[i][j]+grid[i][j];
            }
        }
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                int curSum=grid[i][j];
                int dif=preSum[i-1][j+2]-preSum[i-1][j-1]+preSum[i+1][j+2]-preSum[i+1][j-1];
                ans=Math.max(ans,dif+curSum);
                
            }
        }
        return ans;
        
    }
}
