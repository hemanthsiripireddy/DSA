package pac8;

public class DivideTwoIntegers {
	 public int divide(int dividend, int divisor) {
	        if(dividend==Integer.MIN_VALUE&&divisor==-1)
	        return Integer.MAX_VALUE;
	        boolean isPositive=(dividend<0==divisor<0);
	        dividend=Math.abs(dividend);
	        divisor=Math.abs(divisor);
	        int ans=0,x=0;
	        while(dividend-divisor>=0){
	            for( x=0;dividend-(divisor<<x<<1)>=0;x++);
	            ans+=1<<x;
	            dividend-=divisor<<x;
	        }
	        return isPositive?ans:-ans;
	    }

}
