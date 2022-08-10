package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
	//find if cycle is present
	// if cycle is present,we can't complete courses
	// we can find cycle using depth first search
	 private  List<List<Integer>>adj=new ArrayList<>();
		private boolean cycleFound=false;
		private Map<Integer,String>visited=new HashMap<>();
		
		public  boolean canFinish(int numCourses,int[][] prerequisites) {
	       
			for(int i=0;i<numCourses;i++) {
				adj.add(new ArrayList<Integer>());
				visited.put(i, "U");
			}
		
			for(int i=0;i<prerequisites.length;i++) {
				int[] node=prerequisites[i];
				int fromNode=node[1];
				int toNode=node[0];
				adj.get(fromNode).add(toNode);
			}
			for(int i=0;i<numCourses;i++) {
				if(visited.get(i).equals("U")) {
					dfs(i);
				}
				if(cycleFound==true) {
					return false;
					
				}
			}
			return !cycleFound;
		}
		public  void dfs(int source) {
			if(visited.get(source).equals("U")) {
				visited.put(source, "V");
				List<Integer>lst=adj.get(source);
				for(int i:lst) {
				
						dfs(i);
					
				}
				visited.put(source, "P");
				
			}
			else if(visited.get(source).equals("V")){
				cycleFound=true;
			}
			
		}
}
