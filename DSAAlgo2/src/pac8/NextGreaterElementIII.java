package pac8;

import java.util.PriorityQueue;

public class NextGreaterElementIII {
	public int nextGreaterElement(int n) {
	      PriorityQueue<Long> pQueue = new PriorityQueue<Long>();
	      long n1=n;
	      while(n1/10>=1){
	          if((n1/10)%10>=n1%10){
	                  pQueue.add(n1%10);
	          n1/=10;
	          }else{
	              long temp=(int)(n1/10)%10;
	              pQueue.add(n1%10); 
	              n1/=100;
	                 PriorityQueue<Long> p = new PriorityQueue<Long>(pQueue);
	                 while(p.peek()<=temp){
	                     p.poll();
	                 }
	              n1=n1*10+p.peek();
	              pQueue.add(temp);
	              pQueue.remove(p.peek());
	              while(pQueue.size()>0){
	                  n1=n1*10+pQueue.poll();
	              }
	              if(n1>Integer.MAX_VALUE){
	                  return -1;
	              }
	              return (int)n1;
	          }
	        

	      }
	      return -1;
	        
	    }

}
