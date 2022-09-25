package pac3;

public class OptimalArray {
	 public long[] optimalArray(int n,int a[])
	    {
	        int pre[]=new int[n];
	        long[] l=new long[n];
	        l[0]=0;
	        pre[0]=a[0];
	        for(int i=1;i<n;i++){
	            pre[i]=pre[i-1]+a[i];
	        }
	        for(int i=1;i<n;i++){
	            int m=i/2;
	            int sum=0;
	            if(m>0)
	            sum+=(m*a[m]-pre[m-1]);
	            if(m<n-1)
	            sum+=(pre[i]-pre[m]-(i-m)*a[m]);
	            l[i]=sum;
	        }
	        return l;
	        
	    }

}
