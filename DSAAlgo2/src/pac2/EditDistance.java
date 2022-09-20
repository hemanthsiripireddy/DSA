package pac2;

public class EditDistance {
	public int minDistance(String word1, String word2) {
        int n1=word1.length()-1;
        int n2=word2.length()-1;
        int dp[][]=new int[n1+2][n2+2];
        for(int i=0;i<=n1+1;i++){
            for(int j=0;j<=n2+1;j++){
                if(j==0||i==0){
                    dp[i][j]=Math.max(i,j);
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<=n1+1;i++){
            for(int j=0;j<=n2+1;j++){
                if(j==0||i==0)
                    continue;
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));
                }
            }
        }
         return dp[n1+1][n2+1];
        
    }

}
