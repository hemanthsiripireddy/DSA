package pac5;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
	public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE,white=0,l=-1;
        for(int i=0;i<blocks.length();i++){
            white+=blocks.charAt(i)=='W'?1:0;
            if(i-l==k){
                min=Math.min(min,white);
                white-=blocks.charAt(++l)=='W'?1:0;
            }
            
        }
        return min;
        
        
    }

}
