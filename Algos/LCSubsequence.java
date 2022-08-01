
public class LCS {
	public static String longestCS(String s1,String s2, int m,int n) {
		int[][] l=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0) {
					l[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					l[i][j]=1+l[i-1][j-1];
					
				}
				else {
					l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
				}
				
			}
		}
		int index=l[m][n];
		int temp=index;
		System.out.println(index);
		char[] lcs =new char[index];
		lcs[index]='\u0000';
		int i=m,j=n;
//		m=m-1;
//		n=n-1;
		
		while(i>0&&j>0) {
			if(s1.charAt(i-1)==s2.charAt(j-1)) {
				
			
				lcs[index-1]=s1.charAt(i-1);
				i--;
				j--;
				index--;
				
			}
			else if(l[i-1][j]>l[i][j-1]) {
				i--;
			}
			else
				j--;
		}
		//for (int k = 0; k <= temp; k++)
           // System.out.print(lcs[k]);
    
		return String.valueOf(lcs);
	}
	
	

}
