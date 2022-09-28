package pac3;

public class NumberofPeopleAwareofaSecret {
	 public int peopleAwareOfSecret(int n, int delay, int forget) {
	        long dp[]=new long[n+1];
	        long share=0;
	        long mod=(long)1e9+7;
	        dp[1]=1;
	        for(int i=2;i<=n;i++){
	            dp[i]=share=(share+dp[Math.max(i-delay,0)]-dp[Math.max(i-forget,0)]+mod)%mod;
	        }
	        long ans=0;
	        for(int i=n-forget+1;i<=n;i++){
	            ans=(ans+dp[i])%mod;
	        }
	        return (int)ans;
	        
	    }

}
