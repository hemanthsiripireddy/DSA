package febWeek12023;

public class BestTeamWithNoConflicts {
	public static void method() {
		int[] scores=new int[] {4,5,6,5};
		int[] ages=new int[] {2,1,2,1};
		int res=bestTeamScore(scores, ages);
		System.out.println(res);
	}
	public static int bestTeamScore(int[] scores, int[] ages) {
        for(int i=0;i<ages.length;i++){
            int index=i;
            for(int j=i+1;j<ages.length;j++){
                if(ages[j]<ages[index])
                index=j;

            }
            if(index!=i){
                int temp=ages[i];
                ages[i]=ages[index];
                ages[index]=temp;
                temp=scores[i];
                scores[i]=scores[index];
                scores[index]=temp;
            }
        }
        int res=0;
        int max=scores[0];
        for(int i=1;i<scores.length;i++){
            if(ages[i]>ages[i-1]&&scores[i]<scores[i-1]){
                res=Math.max(res,max);
                max=scores[i];
            }else{
                max+=scores[i];
            }

        }
         res=Math.max(res,max);
        return res;
        
    }

}
