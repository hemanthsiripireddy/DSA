package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	public static int orangesRotting(int[][] grid) {
		if(grid.length==0) {
			return 0;
		}
		int row=grid.length;
		int col=grid[0].length;
		Queue<int[]>q=new LinkedList<>();
		int totalOranges=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(grid[i][j]==2)
					q.add(new int[]{i,j});
				if(grid[i][j]!=0)
					totalOranges++;
			}
			
		}
		int min=0,rottedOranges=0;
		int xAxis[]= {-1,1,0,0};
		int yAxis[]= {0,0,1,-1};
		while(!q.isEmpty()) {
			
			int rCount=q.size();
			rottedOranges+=q.size();
			
			while(rCount>0) {
				int[] rq=q.poll();
				for(int i=0;i<4;i++) {
					int x=rq[0]+xAxis[i];
					int y=rq[1]+yAxis[i];
					if(x<0||x>=row||y<0||y>=col||grid[x][y]==0||grid[x][y]==2)
						continue;
					q.add(new int[]{x,y});
					grid[x][y]=2;
					
				}
				rCount--;
			}
			min++;
		}
		
		return (totalOranges==rottedOranges)?min-1:-1;
	}
	}



