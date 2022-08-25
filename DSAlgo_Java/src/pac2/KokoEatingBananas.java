package pac2;

public class KokoEatingBananas {
	public int minEatingSpeed(int[] piles, int h) {
        int end=piles[0];
        for(int i=1;i<piles.length;i++){
            if(end<piles[i])
                end=piles[i];
            
        }
        int start=1;
        while(start<end){
            int mid=(start+end)/2;
            if(isPossible(mid,h,piles)){
            end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
        
        
    }
    public boolean isPossible(double speed,int h,int[] piles){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=Math.ceil(piles[i]/speed);
            
            
        }
        if(time<=h)
            return true;
        return false;
    }

}
