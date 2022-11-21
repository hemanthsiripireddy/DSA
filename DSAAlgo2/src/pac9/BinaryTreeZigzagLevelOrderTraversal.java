package pac9;
import pac1.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
	List<List<Integer>>list;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        list=new ArrayList<>();
        helper(root,0);
        for(int i=0;i<list.size();i++){
            if(i%2==1){
                List<Integer>l=list.get(i);
                 Collections.reverse(l);

            }
        }
        return list;

        
    }
    public void helper(TreeNode root,int level){
        if(root==null)
        return;
          if(level+1>list.size()){
            List<Integer>l=new ArrayList<>();
            list.add(l);
        }
        list.get(level).add(root.val);
        helper(root.left,level+1);
      
        helper(root.right,level+1);
    }

}
