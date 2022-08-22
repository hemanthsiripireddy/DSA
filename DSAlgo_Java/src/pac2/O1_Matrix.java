package pac2;

import java.util.LinkedList;
import java.util.Queue;

public class O1_Matrix {
	public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] distance=new int[m][n];
        Queue<String>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)
                    distance[i][j]=m*n;
                else
                {
                    distance[i][j]=0;
                    q.add(i+"-"+j);
                }
            }
        }
        while(q.size()>0){
            String s=q.poll();
            int i=Integer.parseInt(s.split("-")[0]);
            int j=Integer.parseInt(s.split("-")[1]);
            int newDistance=distance[i][j]+1;
            if(isValid(i+1,j,mat)&&distance[i+1][j]>newDistance){
                distance[i+1][j]=newDistance;
                q.add((i+1)+"-"+j);
            }
             if(isValid(i-1,j,mat)&&distance[i-1][j]>newDistance){
                distance[i-1][j]=newDistance;
                q.add((i-1)+"-"+j);
            }
             if(isValid(i,j+1,mat)&&distance[i][j+1]>newDistance){
                distance[i][j+1]=newDistance;
                q.add(i+"-"+(j+1));
            }
             if(isValid(i,j-1,mat)&&distance[i][j-1]>newDistance){
                distance[i][j-1]=newDistance;
                q.add(i+"-"+(j-1));
            }
        }
        return distance;
        
    }
    public boolean isValid(int i,int j,int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        if(i<0||i>=m)return false;
        if(j<0||j>=n)return false;
        if(mat[i][j]==0)return false;
        return true;
    }

}
