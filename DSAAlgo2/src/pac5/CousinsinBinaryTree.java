package pac5;

public class CousinsinBinaryTree {
	int x1=0,y1=0;TreeNode xNode=null,yNode=null;
    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root,null,x,y,0);
        if(x1==y1&&xNode!=yNode)
        return true;
        return false;

        
    }
    public void helper(TreeNode root,TreeNode p,int x,int y,int k){
        if(root!=null&&(x1==0||y1==0)){
            if(root.val==x){
                 x1=k;
                 xNode=p;
            }
           
            else if (root.val==y){

 y1=k;  
 yNode=p;
            }
           
          helper(root.left,root,x,y,k+1);
          helper(root.right,root,x,y,k+1);
            
        }
    }

}
