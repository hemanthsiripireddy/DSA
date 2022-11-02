package pac7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import javafx.util.Pair; 

public class NetworkDelayTime {
	Map<Integer,List<Pair<Integer,Integer>>>adj=new HashMap<>();
    public void dijkstra(int[] receivedTimeAt,int source,int n){
        Queue<Pair<Integer,Integer>> pq=new PriorityQueue<Pair<Integer,Integer>>(Comparator.comparing(Pair::getKey));
        pq.add(new Pair(0,source));
        receivedTimeAt[source]=0;
        while(!pq.isEmpty()){
            Pair<Integer,Integer>pair=pq.remove();
            int currNode=pair.getValue();
            int time=pair.getKey();
            if(time>receivedTimeAt[currNode]){
                continue;
            }
            if(!adj.containsKey(currNode)){
                continue;
            }
            for(Pair<Integer,Integer>pair1:adj.get(currNode)){
                int neighbourNode=pair1.getValue();
                int neighbourTime=pair1.getKey();
                if(receivedTimeAt[neighbourNode]>neighbourTime+time){
                    receivedTimeAt[neighbourNode]=neighbourTime+time;
                    pq.add(new Pair(neighbourTime+time,neighbourNode));
                }
                
            }
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        for(int[] time:times){
            int  source=time[0];
            int dest=time[1];
            int time1=time[2];
            adj.putIfAbsent(source,new ArrayList<>());
            adj.get(source).add(new Pair(time1,dest));

        }
        int[] receivedTimeAt=new int[n+1];
        Arrays.fill(receivedTimeAt,Integer.MAX_VALUE);
        dijkstra(receivedTimeAt,k,0);
         int ans=Integer.MIN_VALUE;
         for(int i=1;i<=n;i++){
             ans=Math.max(ans,receivedTimeAt[i]);

         }
         return ans==Integer.MAX_VALUE?-1:ans;
        
           }

}
