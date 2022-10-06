package pac5;

import java.util.PriorityQueue;

public class RangeSumofSortedSubarraySums {
	 static class Pair{
         int index;
         int sum;
         public Pair(int index,int sum){
             this.index=index;
             this.sum=sum;
         }
     }
 public int rangeSum(int[] nums, int n, int left, int right) {
     PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.sum-b.sum);
     int ans=0,mod=1_000_000_007;
     for(int i=0;i<n;i++){
         pq.offer(new Pair(i,nums[i]));
     }
     left--;
     right--;
     for(int i=0;i<=right;i++){
        Pair p=pq.poll();
         if(i>=left){
             ans=(ans%mod+p.sum%mod)%mod;
         }
         if(p.index<n-1){
             p.sum=(p.sum%mod+nums[++p.index]);
             pq.offer(p);
         }
     }
     return ans;
     
     
 }

}
