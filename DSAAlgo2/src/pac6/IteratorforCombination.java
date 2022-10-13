package pac6;

import java.util.ArrayList;
import java.util.List;

public class IteratorforCombination {
	List<String>list;
    int index=0;

    public IteratorforCombination(String characters, int combinationLength) {
        list=new ArrayList<>();
        helper(characters,"",0,0,combinationLength);
        
    }
    private void helper(String str,String tempStr,int itrL,int count,int cl){
        if(count==cl){
            list.add(tempStr);
            return;
        }
        if(itrL==str.length()){
            return;
        }
        helper(str,tempStr+str.charAt(itrL),itrL+1,count+1,cl);
        helper(str,tempStr,itrL+1,count,cl);
    }
    
    public String next() {
        return list.get(index++);
        
    }
    
    public boolean hasNext() {
        if(list.size()==index)
        return false;
        return true;
        
    }

}
