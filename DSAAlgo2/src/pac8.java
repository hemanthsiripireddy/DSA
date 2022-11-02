import java.util.HashSet;
import java.util.Set;

public class pac8 {
	 public boolean isValidSudoku(char[][] board) {
	        Set set=new HashSet();
	        for(int i=0;i<9;i++){
	            for(int j=0;j<9;j++){
	            if(board[i][j]!='.'){

	                 String ch="("+board[i][j]+")";
	             if(!set.add(ch+i)||!set.add(j+ch)||!set.add(i/3+ch+j/3))
	             return false;
	            }
	            }
	        }
	        return true;
	        
	    }

}
