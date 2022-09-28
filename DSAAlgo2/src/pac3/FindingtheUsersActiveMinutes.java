package pac3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindingtheUsersActiveMinutes {
	public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<logs.length;i++){
            if(set.add(""+logs[i][0]+"-"+logs[i][1])){
                map.put(logs[i][0],map.getOrDefault(logs[i][0],0)+1);
            }
            
        }
        int[] ans=new int[k];
         for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans[entry.getValue()-1]++;
        }
        return ans;
    }

}
