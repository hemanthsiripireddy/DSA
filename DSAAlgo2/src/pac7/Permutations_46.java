package pac7;
import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        backtracking(list,new ArrayList<>(),nums);
        return list;
        
    }
    public void backtracking(List<List<Integer>>list,List<Integer> lst,int[] nums){
        if(lst.size()==nums.length){
            list.add(new ArrayList<>(lst));
        }else{
            for(int i=0;i<nums.length;i++){
                if(lst.contains(nums[i]))continue;
                lst.add(nums[i]);
                backtracking (list,lst,nums);
                lst.remove(lst.size()-1);
            }
        }
    }

}
