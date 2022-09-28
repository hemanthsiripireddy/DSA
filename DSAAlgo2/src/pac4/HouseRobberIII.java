package pac4;



public class HouseRobberIII {
	 public int rob(TreeNode root) {
		    int[] ans=trav(root);
		        return Math.max(ans[0],ans[1]);
		        
		    }
		    public int[] trav(TreeNode node){
		        if(node==null)
		            return new int[]{0,0};
		        int left[]= trav(node.left);
		        int right[]=trav(node.right); 
		        int f=node.val+left[1]+right[1];
		        int s=Math.max(left[1],left[0])+Math.max(right[0],right[1]);
		        return new int[]{f,s};
		    }

}
