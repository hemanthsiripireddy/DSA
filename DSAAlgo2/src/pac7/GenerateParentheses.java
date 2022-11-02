package pac7;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	StringBuilder temp=new StringBuilder();
    List<String>list=new ArrayList<>();
    int len=0;
    public List<String> generateParenthesis(int n) {
        len=n;
        backtracking(0,0);
        return list;
        
    }
    public void backtracking(int open,int close){
        if(open==len&&close==len){
            list.add(temp.toString());
            return;

        }
        if(open<len){
            temp.append('(');
            backtracking(open+1,close);
            temp.deleteCharAt(temp.length() - 1);
        }
        if(close<open){
            temp.append(')');
            backtracking(open,close+1);
            temp.deleteCharAt(temp.length() - 1);

        }
    }

}
