package pac2;
public class SerializeandDeserializeBinaryTree {

	public String serialize(TreeNode root) 
	{
	    StringBuilder sb = new StringBuilder();
	    
	    getString(root,sb);
	    
	    return sb.toString();
	}

	void getString(TreeNode root,StringBuilder sb)
	{
	    if(root==null)
	    {
	        sb.append("null,");
	        return;
	    }
	    sb.append(root.val+",");
	    getString(root.left,sb);
	    getString(root.right,sb);
	}

	// Decodes your encoded data to tree.
	int index ;

	public TreeNode deserialize(String data) {
	    String[] arr = data.split(",");
	    index = 0;
	    return deserializeHelper(arr);
	}

	TreeNode deserializeHelper(String[] arr)
	{
	    if(index >= arr.length || arr[index].equals("null"))
	    {
	        index++;
	        return null;
	    }
	    TreeNode root = new TreeNode(Integer.parseInt(arr[index++]));
	    root.left = deserializeHelper(arr);
	    root.right = deserializeHelper(arr);
	    
	    return root;
	}
}
