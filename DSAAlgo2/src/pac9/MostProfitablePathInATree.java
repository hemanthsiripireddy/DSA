package pac9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MostProfitablePathInATree {
	 Map<Integer,List<Integer>>tree=new HashMap<>();
	    int[] dist;
	    int[] parentNode;
	    private void constructTree(int[][] edges){
	        int n=edges.length;
	        for(int i=0;i<n;i++){
	            if(!tree.containsKey(edges[i][0])){
	                tree.put(edges[i][0],new ArrayList<>());
	            }
	            if(!tree.containsKey(edges[i][1])){
	                tree.put(edges[i][1],new ArrayList<>());
	            }
	            tree.get(edges[i][0]).add(edges[i][1]);
	            tree.get(edges[i][1]).add(edges[i][0]);
	        }
	    }
	    Set<Integer>visited=new HashSet<>();
	    int ans=0;
	    int ansMax=Integer.MIN_VALUE;
	    private void dfs(int curr,int[] amount){
	        visited.add(curr);
	        int trav=0;
	        ans+=amount[curr];
	        for(Integer i:tree.get(curr)){
	            if(visited.contains(i))
	                continue;
	            trav++;
	            dfs(i,amount);
	        }
	        if(trav==0)
	            ansMax=Math.max(ans,ansMax);
	        ans-=amount[curr];
	    }
	    
	    private void dfsToFindParent(int curr,int parent,int distance){
	        dist[curr]=distance;
	        parentNode[curr]=parent;
	        for(Integer currNeighbour :tree.get(curr)){
	            if(currNeighbour==parent)
	                continue;
	            dfsToFindParent(currNeighbour,curr,distance+1);
	        }
	        
	    }
	    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
	        int n=edges.length;
	        constructTree(edges);
	        dist=new int[n];
	        parentNode=new int[n+1];
	      //  Arrays.fill(dist,-1);
	       // Arrays.fill(parentNode,-1);
	       dfsToFindParent(0,0,0);
	        int curr=bob;
	        int currdist=0;
	        while(curr!=0){
	            if(dist[curr]>currdist){
	                amount[curr]=0;
	            }
	            else if(dist[curr]==currdist){
	                amount[curr]/=2;
	            }
	            currdist++;
	            curr=parentNode[curr];
	        }
	        dfs(0,amount);
	        return ansMax;
	        
	        
	        
	    }

}
