package pac2;

public class NumberofEnclaves {
	 public int numEnclaves(int[][] grid) {
	        int n=grid.length;
	    int m=grid[0].length;
	    for(int i=0;i<n;i++){
	        bfs(i,0,grid);
	        bfs(i,m-1,grid);
	    }
	          for(int i=0;i<m;i++){
	        bfs(0,i,grid);
	        bfs(n-1,i,grid);
	    }
	          int count=0;
	          for(int i=0;i<n;i++){
	              for(int j=0;j<m;j++){
	                  if(grid[i][j]==1)
	                      count++;
	              }
	          }
	          return count;
	        
	    }
	     public void bfs(int i,int j,int[][] grid){
	       if((i>=0&&i<grid.length)&&(j>=0&&j<grid[0].length)&&grid[i][j]==1){
	           grid[i][j]=0;
	           bfs(i+1,j,grid);
	            bfs(i-1,j,grid);
	            bfs(i,j+1,grid);
	            bfs(i,j-1,grid);
	           
	       }
	}
}
