package pac2;

public class CoutingBits {
	public int[] countBits(int n) {
        int[] lst=new int[n+1];
        for(int i=0;i<=n;i++){
            lst[i]=getCount(i);
        }
        return lst;
    }
    public int getCount(int n){
        int count=0;
        for(int i=0;i<=31;i++){
            if((n&(1<<i))>0)
                count++;
           
        }
         return count;
    }

}
