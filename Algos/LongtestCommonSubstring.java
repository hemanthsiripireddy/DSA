
public class LongtestCommonSubstring {
	public static String lCS(String s1,String s2, int m,int n) {
		int[][] l=new int[m+1][n+1];
		int max=0,i1=0,j1=0;
		//int[][] max=new int[1][1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0) {
					l[i][j]=0;
				}else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					l[i][j]=1+l[i-1][j-1];
					if(max<l[i][j]) {
						i1=i;
						j1=j;
						max=l[i][j];
					}
				}
				else
					l[i][j]=0;
			}
		}
		char[] ch=new char[max];
		System.out.println(max);
		System.out.println(i1+" "+j1);
		int temp=max;
		while(i1>0&&j1>0&&temp>0) {
			ch[--temp]=s1.charAt(i1-1);
			i1--;
			j1--;
			
			
		}
		return String.valueOf(ch);
		
	}

}
