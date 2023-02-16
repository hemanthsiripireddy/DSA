package dynamicProgramming;

public class ServiceNowCompanyNumberOfWaysProblem {
	public static void method() {
		int n=50;
		long res=approach(n);
		System.out.println(res);
	}

	private static long approach(int n) {
		// TODO Auto-generated method stub
		//1-- for full
		//2--for right
		//3-- for left
		long[][] dp=new long[n+1][4];
		dp[1][1]=0;
		dp[1][2]=0;
		dp[1][3]=0;
		dp[2][1]=3;
		dp[2][2]=1;
		dp[2][3]=1;
		int i=3;
		while(i<=n) {
			dp[i][1]=3*dp[i-2][1]+dp[i-2][2]+dp[i-2][3];
			dp[i][2]=dp[i-2][1]+dp[i-2][2];
			dp[i][3]=dp[i-2][1]+dp[i-3][3];
			i++;
		}
		return dp[n][1];
	}

}
