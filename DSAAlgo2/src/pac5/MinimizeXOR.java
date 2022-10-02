package pac5;

public class MinimizeXOR {
	public int msb(int num){
        int msb=0;
        num/=2;
        while(num>0){
            msb++;
            num/=2;
        }
        return 1<<msb;
    }
    public int countBits(int num){
        int count=0;
        while(num>0){
            count++;
            num&=(num-1);
        }
        return count;
    }
    public int minimizeXor(int num1, int num2) {
        int ct1=countBits(num1);
        int ct2=countBits(num2);
        if(ct1<=ct2){
            int ans=num1,num=num1,dif=ct2-ct1;
            int two=1;
            while(num>0&&dif>0){
                if(num%2==0){
                    ans+=two;
                    dif--;
                    
                  
                }
                num>>=1;
                  two<<=1;
            }
            while(dif>0){
                ans+=two;
                two<<=1;
                dif--;
            }
            return ans;
            
        }
        int dif=ct2-ct1, ans=0 ,num=num1, x=0;
       
       
        
        while(ct2>0){
            x=msb(num);
            ans+=x;
            ct2--;
            num&=(x-1);
        }
        return ans;
        
    }

}
