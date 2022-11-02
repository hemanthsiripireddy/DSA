package pac7;

public class HappyNumber {
	public boolean isHappy(int n) {
        int slow=n,fast=n;
        while(fast!=1&&fast!=slow){
            slow=nextNum(slow);
            fast=nextNum(nextNum(fast));


        }
        return fast==1;
    }
    public int nextNum(int n){
        int value=0;
        while(n>0){
            value+=(Math.pow(n%10,2));
            n/=10;
        }
        return value;
    }

}
