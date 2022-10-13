package pac6;

import java.util.HashMap;
import java.util.Map;

public class RingsandRods {
	public int countPoints(String rings) {
        Map<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<rings.length();i=i+2){
            char ch=rings.charAt(i);
            int num=Integer.parseInt(rings.charAt(i+1)+"");
            if(map.get(num)==null){
                map.put(num,new int[3]);
            }
            int[] arr=map.get(num);
            if(ch=='R')
            arr[0]+=1;
            else if(ch=='G')
            arr[1]+=1;
            else
            arr[2]+=1;
        }
        int count=0;
        for(Map.Entry<Integer,int[]>entry:map.entrySet()){
            int[] arr=entry.getValue();
            if(arr[0]>0&&arr[1]>0&&arr[2]>0)
            count++;
        }
        return count;
        
    }

}
