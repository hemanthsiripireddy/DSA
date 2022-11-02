package pac7;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
	List<List<Integer>>list=new ArrayList<>();
    List<Integer>lst=new ArrayList<>();
    int n=0,k=0;
    public List<List<Integer>> subsets(int[] nums) {
        for(k=0;k<=nums.length;k++){
            bracktracking(0,nums);
        }
        return list;
        
    }
    public void bracktracking(int first,int[] nums){
        if(k==lst.size()){
            list.add(new ArrayList<>(lst));
            return;
        }
        for(int i=first;i<nums.length;i++){
            lst.add(nums[i]);
            bracktracking(i+1,nums);
            lst.remove(lst.size()-1);
        }
    }

}
