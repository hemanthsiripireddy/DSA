
public class Dijkstras_shortest_path {
	public static void dijkstrasAlgo() {
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
            int dst[]=dk(graph,0);
//            for(int i=0;i<9;i++) {
//            	System.out.println(i+1+": "+dst[i]);
//            }
	}
	public static int[] dk(int[][] graph,int src) {
		int V=9;
		int dst[]=new int[V];
		boolean sptSet[]=new boolean[V];
		for (int i = 0; i < V; i++) {
            dst[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
		dst[src]=0;
		for(int v=0;v<V-1;v++) {
			
			int u=minDistance(dst,sptSet,V);
			//dst[v]=u;
			sptSet[u]=true;
			for(int i=0;i<V;i++) {
				if(graph[u][i]!=0&&sptSet[i]==false&&dst[u]!=Integer.MAX_VALUE&&dst[u]+graph[u][i]<=dst[i]) {
					dst[i]=dst[u]+graph[u][i];
				}
			}
			
		}
		 for(int i=0;i<9;i++) {
         	System.out.println(i+": "+dst[i]);
         }
		return dst;
		
		
	}
	public static int minDistance(int[] dst,boolean spt[],int V) {
		int minValue=Integer.MAX_VALUE,minIndex=-1;
		for(int v=0;v<V;v++) {
			if(dst[v]<=minValue&&spt[v]==false) {
				minValue=dst[v];
				minIndex=v;
			}
			
		}
		return minIndex;
			
	}

}
