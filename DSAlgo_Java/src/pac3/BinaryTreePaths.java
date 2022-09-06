package pac3;

import java.util.ArrayList;
import java.util.List;
import general.*;

public class BinaryTreePaths {
	 public List<String> binaryTreePaths(TreeNode root) {
	        List<String>str=new ArrayList<>();
	        if(root==null)
	            return null;
	        else
	        {
	            String s=""+root.val;
	            if(root.left==null&&root.right==null)
	            str.add(s);
	           if(root.left!=null) func(str,s,root.left);
	            if(root.right!=null) func(str,s,root.right);
	        }
	        return  str;
	        
	    }

	    public void func(List<String>strList,String s,TreeNode node){
	        if(node.left==null && node.right==null)
	            
	            strList.add(s+"->"+node.val);
	        else{
	          if(node.left!=null)  func(strList,s+"->"+node.val,node.left);
	            if(node.right!=null)  func(strList,s+"->"+node.val,node.right);
	            
	        }
	    }

}
