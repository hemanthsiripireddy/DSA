package pac8;

public class WordSearch {
	 public boolean exist(char[][] board, String word) {
	        char[] w= word.toCharArray();
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[0].length;j++){
	                if(helper(i,j,board,w,0))
	                return true;
	            }
	        }
	        return false;
	        
	    }
	    public boolean helper(int i,int j,char[][] board,char[] w,int l){
	        if(l==w.length)
	        return true;
	        if(i<0||j<0||i>=board.length||j>=board[0].length||w[l]!=board[i][j])
	        return false;
	        board[i][j]='*';
	        boolean ans=helper(i+1,j,board,w,l+1)||helper(i-1,j,board,w,l+1)||helper(i,j+1,board,w,l+1)||helper(i,j-1,board,w,l+1);
	        board[i][j]=w[l];
	        return ans;
	    }

}
