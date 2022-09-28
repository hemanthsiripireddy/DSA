package pac3;

public class TwoSum_II_nputArrayIsSorted {
	 public int[] twoSum(int[] numbers, int target) {
	        int start=0,end=numbers.length-1;
	        while(start<end){
	            if(numbers[start]+numbers[end]<target){
	                start++;
	            }
	            else if(numbers[start]+numbers[end]>target){
	                end--;
	            }
	            else
	                break;
	        }
	        return new int[]{start+1,end+1};
	        
	    }

}
