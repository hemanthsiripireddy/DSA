package pac1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>>lst=new ArrayList<List<Integer>>();
	        List<Integer>lst2=new ArrayList<Integer>();
	        
	        for(int i=0;i<numRows;i++){
	            lst2.add(1);
	            for(int j=i-1;j>0;j--){
	                lst2.set(j,lst2.get(j)+lst2.get(j-1));
	            }
	            ArrayList<Integer> AL2= new ArrayList<>();
	       AL2.addAll(lst2);
	            lst.add(AL2);
	        }
	        return lst;
	        
	    }

}
