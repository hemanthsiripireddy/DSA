package pac2;

import java.util.Stack;

public class NextGreaterElement_II {
	 public int[] nextGreaterElements(int[] nums) {
	        Stack<Integer>stack =new Stack<Integer>();
	        int[] ans=new int[nums.length];
	        stack.push(0);
	        for(int i=1;i<nums.length;i++){
	            int current=nums[i];
	            while(stack.size()>0&&nums[stack.peek()]<current){
	                ans[stack.pop()]=current;
	            }
	            stack.push(i);
	        }
	         for(int i=0;i<nums.length;i++){
	            int current=nums[i];
	            while(stack.size()>0&&nums[stack.peek()]<current){
	                ans[stack.pop()]=current;
	            }
	           
	        }
	        while(stack.size()>0){
	            ans[stack.pop()]=-1;
	        }
	        return ans;
	    }

}
