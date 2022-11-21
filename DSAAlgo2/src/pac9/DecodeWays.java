package pac9;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
	Map<String,Integer>map;
    public int numDecodings(String s) {
        int l=s.length(),i=0,val=0;
       map=new HashMap<>();
       if(s.charAt(0)=='0')
       return 0;
       int sum=0;
       if(i<l){
          val=helper(i+1,s);
           sum+=(val);
           map.put(i+" "+1,val);

       }
       
       if(i+1<l&&Integer.parseInt(s.substring(i,i+2))<=26){
           val=helper(i+2,s);
           sum+=(val);
           map.put(i+" "+2,val);
       }
       return sum;
       

        
        
    }
    public int helper(int i,String s){
        if(i==s.length())
        return 1;
        int sum=0,val=0;
        if(s.charAt(i)=='0')
        return 0;
        if(map.containsKey(i+" "+1)){
            sum+=map.get(i+" "+1);
        }
       else  if(i<s.length()){
           val=helper(i+1,s);
           sum+=val;
           map.put(i+" "+1,val);

        }

        if(map.containsKey(i+" "+2)){
            sum+=map.get(i+" "+2);

        }else if(i+1<s.length()&&Integer.parseInt(s.substring(i,i+2))<=26){
            val=helper(i+2,s);
            sum+=val;
            map.put(i+" "+2,val);
        }
        return sum;
    }

}
