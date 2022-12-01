package pac10;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquares {
	 List<Integer>list=new ArrayList<>();
     int count=0;
    int ansCount=Integer.MAX_VALUE;
     int ans=0;
     int target=0;
  public  int numSquares(int n) {
      int i=1;
      target=n;
      
      while(true){
          if(i*i<=n){
              list.add(i*i);
              i++;
          }else{
              break;
          }
      }
      int l=list.size()-1;
      helper(n,l);
      return ansCount;

      
  }

 // List<Integer>ans=new ArrayList<>();
  private   void helper(int n,int i){
  	for(int j=i;j>=0;j--) {
  		int val=list.get(j);
  		if(ans+val>target) {
  			continue;
  		}
  		ans+=val;
  		count++;
  		
  		if(ans==target) {
  			if(ansCount>count) {
  				ansCount=count;
  			}
  			ans-=val;
      		count--;
  			break;
  		}
          if(count<ansCount)
  		helper(n-val,j);
  		ans-=val;
  		count--;
  		
  	}
  	

  }

}
