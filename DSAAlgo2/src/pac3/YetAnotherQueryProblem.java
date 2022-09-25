package pac3;

import java.util.ArrayList;

public class YetAnotherQueryProblem {
public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        
        // code here
        int[][] pre=new int[N][N+1];
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=i;j<N;j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
            pre[i][count]++;
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<N+1;j++){
                pre[i][j]+=pre[i-1][j];
            }
        }
        ArrayList<Integer>lst=new ArrayList<Integer>();
        for(int i=0;i<num;i++){
            int l=Q[i][0],r=Q[i][1],k=Q[i][2];
            lst.add(l>0?pre[r][k]-pre[l-1][k]:pre[r][k]);
            
        }
        return lst;
        
    }

}
