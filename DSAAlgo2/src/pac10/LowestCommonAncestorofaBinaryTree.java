package pac10;
import pac1.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LowestCommonAncestorofaBinaryTree {
	 Map<TreeNode,Boolean>mapP=new HashMap<>();
     Map<TreeNode,Boolean>mapQ=new HashMap<>();
     
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root,p,q);
        
    }
    private TreeNode helper(TreeNode curr,TreeNode p,TreeNode q){
        if(isPresentP(curr.left,p)&&isPresentQ(curr.left,q)){
          return  helper(curr.left,p,q);
        }else if(isPresentP(curr.right,p)&&isPresentQ(curr.right,q)){
          return  helper(curr.right,p,q);
        }else{
            return curr;
        }
    }
    private boolean isPresentP(TreeNode node,TreeNode p){
        
       if(mapP.containsKey(node)){
             return mapP.get(node);
         }
         boolean ans;
        
        if(node!=null){
            if(node==p)
            ans=true;
            else ans= isPresentP(node.left,p)||isPresentP(node.right,p);
        }else
        ans= false;
        mapP.put(node,ans);
          return ans;
    }
     private boolean isPresentQ(TreeNode node,TreeNode p){
         if(mapQ.containsKey(node)){
             return mapQ.get(node);
         }
         boolean ans;
        
        if(node!=null){
            if(node==p)
            ans=true;
            else ans= isPresentQ(node.left,p)||isPresentQ(node.right,p);
        }else
        ans= false;
        mapQ.put(node,ans);
          return ans;
    }

}
