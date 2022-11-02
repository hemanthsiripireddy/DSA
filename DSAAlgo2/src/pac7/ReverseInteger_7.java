package pac7;

public class ReverseInteger_7 {
	 long y=0;
	    public int reverse(int x) {
	        while(x!=0){
	            y=(y*10+x%10);
	            x/=10;
	            if(y>=Integer.MAX_VALUE||y<-Integer.MAX_VALUE)
	            return 0;
	        }
	        return (int)y;

	        
	    }

}
