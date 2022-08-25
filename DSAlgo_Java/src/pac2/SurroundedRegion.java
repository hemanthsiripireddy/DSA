package pac2;

public class SurroundedRegion {
	public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='P';
                }
            }
        }
        for(int i=0;i<m;i++){
            bfs(i,0,board);
            bfs(i,n-1,board);
        }
         for(int i=0;i<n;i++){
            bfs(0,i,board);
            bfs(m-1,i,board);
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='P'){
                    board[i][j]='X';
                }
            }
        }
        
    }
    public void bfs(int row,int col,char[][] board){
        if(row>=0&&row<board.length&&col>=0&&col<board[0].length&&board[row][col]=='P'){
            board[row][col]='O';
            bfs(row+1,col,board);
            bfs(row-1,col,board);
            bfs(row,col+1,board);
            bfs(row,col-1,board);
        }
    }

}
