package general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSorting {
	ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
int n;
boolean visited[];
int incomingEdges[];

	public TopologicalSorting(int n) {
	//super();
	this.n = n;
	visited=new boolean[n];
	 incomingEdges=new int[n];
}
	
	Stack<Integer> q = new Stack<>();
	
	public  void initialize(int n) {
		for( int i=0;i<n;i++) {
			ArrayList<Integer>arr=new ArrayList<Integer>();
			graph.add(arr);
			visited[i]=false;
			incomingEdges[i]=0;
		}
		
	}
	public  void dfsUtil(int source) {
		if(visited[source]==false) {
			visited[source]=true;
			for(int i : graph.get(source)){
				if(visited[i]==false)
					dfsUtil(i);
				
			}
			q.push(source);
		}
	}
	public void dfs(int n) {
		for(int i=0;i<n;i++) {
			if(incomingEdges[i]==0) {
				dfsUtil(i);
				
			}
		}
	}
	public void addEdge(int u,int v) {
		graph.get(u).add(v);
		incomingEdges[v]+=1;
		
	}
	public void print() {
		while(q.size()>0) {
			System.out.println(q.pop());
		}
	}
	

}
