package pac7;

import java.util.HashMap;
import java.util.Map;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
	public int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=60;i++){
            map.put(i,0);
        }
        int count=0;
        for(int i=0;i<time.length;i++){
            if(60-time[i]%60==60)
             count+=map.get(0);
             else
            count+=map.get(60-time[i]%60);
             map.put(time[i]%60,map.get(time[i]%60)+1);
            
        }
        return count;
    }

}
