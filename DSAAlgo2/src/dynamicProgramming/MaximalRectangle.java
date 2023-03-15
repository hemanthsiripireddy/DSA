package dynamicProgramming;

import java.util.Stack;

public class MaximalRectangle {
	public static void method() {
		char[][] matrix= {{}};
		int res=maximalRectangle(matrix);
	}
	 public static int maximalRectangle(char[][] matrix) {
	        int res=0;
	        int[] heigths=new int[matrix[0].length];
	        for(int i=0;i<matrix.length;i++){
	            for(int j=0;j<matrix[0].length;j++){
	                if(matrix[i][j]==1){
	                    heigths[j]++;
	                }else{
	                    heigths[j]=0;
	                }

	            }
	            res=Math.max(res,maxArea(heigths));
	        }
	        return res;
	        
	    }
	    public static int maxArea(int[] heigths){
	        int res=0;
	        Stack<int[]>stack=new Stack<>();
	        for(int i=0;i<heigths.length;i++){
	            int start=i;
	            while(stack.size()!=0&&stack.peek()[1]>heigths[i]){
	                int[] arr=stack.pop();
	                int index=arr[0],h=arr[1];
	                res=Math.max(res,h*(i-index));
	                start=index;
	            }
	            stack.add(new int[]{start,heigths[i]});
	           

	        }
	         while(stack.size()!=0){
	                int[] arr=stack.pop();
	                int index=arr[0],h=arr[1];
	                  res=Math.max(res,h*(heigths.length-index));
	                
	            }
	        return res;
	    }

}
