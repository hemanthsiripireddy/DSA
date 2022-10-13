package pac6;

public class PushDominoes {
	public String pushDominoes(String dominoes) {
        int N=dominoes.length();
        int[] forces=new int[N];
         int force=0;
        for(int i=0;i<N;i++){
           
            if(dominoes.charAt(i)=='R')force=N;
            else if(dominoes.charAt(i)=='L')force=0;
            else force=Math.max(force-1,0);
            forces[i]=force;
        }
        for(int i=N-1;i>=0;i--){
            if(dominoes.charAt(i)=='L')force=N;
            else if(dominoes.charAt(i)=='R')force=0;
            else force =Math.max(force-1,0);
            forces[i]-=force;
        }
       StringBuilder str=new StringBuilder();
        for(int i=0;i<N;i++){
           str.append( forces[i]>0?"R":forces[i]<0?"L":".");
        }
        return str.toString();
        
    }

}
