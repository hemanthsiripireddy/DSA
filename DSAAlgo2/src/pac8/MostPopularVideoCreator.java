package pac8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostPopularVideoCreator {
	 public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
	        int n=creators.length;
	        List<List<String>>list=new ArrayList<>();
	        Map<String, Long>map=new HashMap<>();
	        Map<String,Pair<String,Integer>>high=new HashMap<>();
	        for(int i=0;i<n;i++){
	            String cr=creators[i];
	            String id=ids[i];
	            int v=views[i];
	            map.put(cr,map.getOrDefault(cr,Long.valueOf(0))+v);
	            if(!high.containsKey(cr))high.put(cr,  new Pair <String, Integer> (id, v));
	            if(v>high.get(cr).getValue())
	            high.put(cr,  new Pair <String, Integer> (id, v));
	            else if((v==high.get(cr).getValue())&&high.get(cr).getKey().compareTo(id)>0){
	                 high.put(cr,  new Pair <String, Integer> (id, v));
	                
	            }
	        }
	        long max=-1;
	        for(Map.Entry<String,Long>entry:map.entrySet()){
	            max=Math.max(max,entry.getValue());
	        }
	         for(Map.Entry<String,Long>entry:map.entrySet()){
	            if(max==map.get( entry.getKey())){
	                List<String>l=new ArrayList<>();
	                l.add( entry.getKey());
	                l.add(high.get( entry.getKey()).getKey());
	                list.add(l);
	            }
	           
	        }
	        return list;
	    }

}
