package pac4;

public class TheKWeakestRowsinaMatrix {
	public int[] kWeakestRows(int[][] mat, int k) {
        int[] in=new int[k],val=new int[k];int s=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }else
                break;
            }
           
               if(s<k){
                   in[s]=i;
            val[s++]=count;
             sort(val,s,in);
               }
               else if(val[s-1]>count){
                   in[s-1]=i;
                   val[s-1]=count;
                    sort(val,s,in);

               }
              

           
            
            
            
        }
        return in;
        
    }
    public void sort(int[] arr,int s,int[] in){
        int i=s-1;
        while(i>0){
            if(arr[i-1]>arr[i]){
                
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
                temp=in[i-1];
                in[i-1]=in[i];
                in[i]=temp;
                i--;
            }else
            break;



        }
    }

}
