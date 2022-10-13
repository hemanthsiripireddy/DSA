package pac6;
import pac5.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue<TreeNode>q=new LinkedList<>();
	        List<List<Integer>>list=new ArrayList<>();
	        if(root==null)
	        return list;
	        q.offer(root);
	        while(q.size()!=0){
	            int level=q.size();
	            List<Integer>lst=new ArrayList<>();
	            for(int i=0;i<level;i++){
	                if(q.peek().left!=null)q.offer(q.peek().left);
	                if(q.peek().right!=null)q.offer(q.peek().right);
	               
	                lst.add(q.poll().val);
	            }
	            list.add(lst);

	        }
	        return list;
	        
	    }

}
