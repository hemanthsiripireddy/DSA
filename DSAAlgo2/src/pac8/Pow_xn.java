package pac8;

public class Pow_xn {
	 public double myPow(double x, int n) {
	        double y=x;
	        int n1=n;
	        if(n==Integer.MIN_VALUE){
	            n=n+1;
	        }
	        double ans=1.0;
	        if(n<0){
	            n=-n;
	            x=1/x;
	        }
	        while(n>0){
	            if((n&1)!=0){
	                ans*=x;


	            }
	            x*=x;
	            n>>>=1;
	        }
	       if(n1==Integer.MIN_VALUE)ans*=y;
	        return ans;
	        
	    }

}
