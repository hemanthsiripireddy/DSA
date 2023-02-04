package pac11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LFUCache {
	  public int capacity;
	   public  Map<Integer,List<Integer>>map;
	   public int count;
	    

	    public LFUCache(int capacity) {
	        this.capacity=capacity;
	        map=new HashMap<>();
	        this.count=0;
	        
	    }
	    
	    public int get(int key) {
	        if(map.containsKey(key)){
	            return map.get(key).get(0);

	        }
	        return -1;
	        
	    }
	    
	    
	    public void put(int key, int value) {
	      if(!map.containsKey(key)){
	          if(map.size()>=capacity){
	              removeLFU();
	              
	          }
	            List<Integer>list=new ArrayList<>();
	            list.add(value);
	            list.add(1);
	            list.add(count++);
	            map.put(key, list);
	        }else{
	            List<Integer>list=map.get(key);
	            list.set(0,value);
	            list.set(1,list.get(1)+1);
	            list.set(2,count++);

	        }
	        
	    }
	    public void removeLFU(){
	        List<Integer>keys=new ArrayList<>();
	        int lfu=Integer.MAX_VALUE;
	        for(Map.Entry<Integer,List<Integer>>set:map.entrySet()){
	            lfu=Math.min(lfu,set.getValue().get(1));

	        }
	          for(Map.Entry<Integer,List<Integer>>set:map.entrySet()){
	          if(lfu==set.getValue().get(1)){
	              keys.add(set.getKey());
	          }
	          }
	          int maxCount=Integer.MAX_VALUE;
	          for(int i=0;i<keys.size();i++){
	              int key=keys.get(i);
	              maxCount=Math.min(maxCount,map.get(key).get(2));
	          }
	          int finalKey=0;
	           for(int i=0;i<keys.size();i++){
	                int key=keys.get(i);
	             if(maxCount==map.get(key).get(2)){
	                 finalKey=key;
	                 break;
	             }
	          }
	           map.remove(finalKey);


	        }
	    }


