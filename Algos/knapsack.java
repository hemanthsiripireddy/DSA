
public class Knapsack {
	public static void knapSack() {
//		int p[]= {0,1,2,5,6};
//		int wt[]= {0,2,3,4,5};
//		int m=8,n=4;
		int p[]= {0,60,100,120};
		int wt[]= {0,10,20,30};
		int m=50,n=3;
		int[][] ks=new int[n+1][m+1];
		int totalProfit=0;
		for(int i=0;i<=n;i++) {
			for(int w=0;w<=m;w++) {
				if(i==0||w==0) {
					ks[i][w]=0;
				
				}else if(wt[i]<=w) {
					ks[i][w]=Math.max(p[i]+ks[i-1][w-wt[i]],ks[i-1][w]);
				}
				else {
					ks[i][w]=ks[i-1][w];
				}
			}
		}
		System.out.println(ks[n][m]);
		totalProfit=ks[n][m];
		int i=n,j=m;
		while(i>0&&j>0) {
			if(ks[i][j]==ks[i-1][j]) {
				System.out.println(0);
				i--;
			}else {
				System.out.println(wt[i]);
				j=j-wt[i];
				i--;
				
			}
		}
	}

}
