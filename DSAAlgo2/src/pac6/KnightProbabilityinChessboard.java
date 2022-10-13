package pac6;

public class KnightProbabilityinChessboard {
	public double knightProbability(int n, int k, int row, int column) {
        double[][] dp=new double[n][n];
        int dr[]=new int[]{-2,-2,2,2,-1,-1,1,1};
        int dc[]=new int[]{1,-1,1,-1,2,-2,2,-2};
        dp[row][column]=1;
        for( ;k>0;k--){
            double[][] dp2=new double[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int m=0;m<8;m++){
                        int r= i+dr[m],c=j+dc[m];
                        if(r>=0&&r<n&&c>=0&&c<n){
                            dp2[r][c]+=dp[i][j]/8.00;
                        }
                    }
                }
            }
            dp=dp2;
        }
        double ans=0.0;
        for(double[] i:dp){
            for(double j:i){
                ans+=j;

            }
        }
        return ans;
        
    }

}
