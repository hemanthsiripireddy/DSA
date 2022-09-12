package pac1;

public class SqrtOfX {
	public int mySqrt(int x) {
        if(x<2)
            return x;
       int start =1,end=x,ans=0;
        while(start<=end){
          int   mid=start+(end-start)/2;
           
            
            if(mid<=x/mid){
                start=mid+1;
                 ans=mid;
            }
            else if(mid>x/mid){
                end=mid-1;
            }
        }
        return ans;
        
    }

}
