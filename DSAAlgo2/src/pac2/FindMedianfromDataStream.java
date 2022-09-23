package pac2;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
	PriorityQueue<Integer> minPQ = new PriorityQueue<>(Collections.reverseOrder()); 
    PriorityQueue<Integer> maxPQ = new PriorityQueue<>(); 

    public void MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxPQ.size()==0){
          maxPQ.add(num);
        return;  
            
        }
            
        if(maxPQ.peek()>num){
            minPQ.add(num);
            if(minPQ.size()-maxPQ.size()>1){
                maxPQ.add(minPQ.poll());
                
            }
        }
        else{
            maxPQ.add(num);
            if(maxPQ.size()-minPQ.size()>1){
                 minPQ.add(maxPQ.poll());
            }
        }
       
        
    }
    
    public double findMedian() {
        if(maxPQ.size()==minPQ.size()){
            return (double)(maxPQ.peek()+minPQ.peek())/2.0;
        }else if(maxPQ.size()>minPQ.size())
            return maxPQ.peek();
        return minPQ.peek();
        
    }

}
