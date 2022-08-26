package pac2;

public class LCS {
	  private String text1,text2;
	    private int[][] db;
	    public int longestCommonSubsequence(String text1, String text2) {
	        this.text1=text1;
	        this.text2=text2;
	        db=new int[text1.length()][text2.length()];
	        return lcs(0,0);
	        
	    }
	    private int lcs(int i,int j){
	        if(i==text1.length()||j==text2.length()){
	            return 0;
	        }
	        if(text1.charAt(i)==text2.charAt(j))
	            db[i][j]= 1+lcs(i+1,j+1);
	        else if(db[i][j]!=0)
	            return db[i][j];
	        else{
	            db[i][j]=Math.max(lcs(i+1,j),lcs(i,j+1));
	        }return db[i][j];
	    }

}
