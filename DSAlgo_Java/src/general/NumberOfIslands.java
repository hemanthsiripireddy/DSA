package general;

import java.util.HashMap;
import java.util.Map;

public class NumberOfIslands {
	// private Map<int[],String>state=new HashMap<>();
	    public int numIslands(char[][] grid) {
	    	int count=0;
//	    	 for(int i=0;i<grid.length;i++){
//		            char[] ch=grid[i];
//		            for(int j=0;j<ch.length;j++){
//		            	int m[]= {i,j};
//		            	state.put(m, "U");
//		            }
//	    	 
//		            }
	        for(int i=0;i<grid.length;i++){
	            char[] ch=grid[i];
	            for(int j=0;j<ch.length;j++){
	            	
	                if(grid[i][j]=='1'){
	                	dfs(i,j,grid);
	                	count++;
	                	
	                }
	            }
	        }
	        return count;
	    
	        
	    }
	    public void dfs(int i,int j,char[][] grid) {
	
	    	if(grid[i][j]!='0') {
	    		if(grid[i][j]=='1') {
	    			grid[i][j]='2';
	    			int rowCount=grid.length;
	    			int colCount=grid[0].length;
	    			
	    			if(i+1<rowCount) {
	    				
	    				dfs(i+1,j,grid);
	    				
	    				
	    			}
	    			if(i-1>=0) {
	    				
	    				dfs(i-1,j,grid);
	    			}
	    			if(j-1>=0) {
	    				
	    				dfs(i,j-1,grid);
	    				
	    			}
	    			if(j+1<colCount) {
	    				
	    				dfs(i,j+1,grid);
	    				
	    			}
	    		}
	    		
	    		
	    	}
	    	
	    	
	    }

}
