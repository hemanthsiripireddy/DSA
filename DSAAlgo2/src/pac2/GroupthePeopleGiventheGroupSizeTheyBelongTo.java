package pac2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupthePeopleGiventheGroupSizeTheyBelongTo {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>>map=new HashMap<>();
        List<List<Integer>>lst1=new ArrayList<List<Integer>>();
        
        for(int i=0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i]))
                map.put(groupSizes[i],new ArrayList<>());
            List<Integer>lst=map.get(groupSizes[i]);
            lst.add(i);
            if(lst.size()==groupSizes[i]){
                lst1.add(lst);
                map.remove(groupSizes[i]);
                
            }
        }
        return lst1;
        
    }

}
