package quickSortPattern;

public class FindtheKthLargestIntegerintheArray {
	String res = "";

	public String kthLargestNumber(String[] nums, int k) {
		// k=nums.length-k;
		quickSort(nums, 0, nums.length - 1, k);
		return res;

	}

	public void quickSort(String[] nums, int start, int end, int k) {
		if (start > end)
			return;
		int pivot = sort(nums, start, end);
		if (pivot == k - 1)
			res = nums[k - 1];
		else if (pivot > k - 1)
			quickSort(nums, start, pivot - 1, k);
		else
			quickSort(nums, pivot + 1, end, k);
	}

	public int sort(String[] nums, int start, int end) {
		String pivotVal = nums[end];
		int pivotPost = start;
		for (int i = start; i <= end; i++) {
			if (compare(nums[i],pivotVal)) {
				String temp = nums[i];
				nums[i] = nums[pivotPost];
				nums[pivotPost] = temp;
				pivotPost++;
			}
		}
		return pivotPost - 1;
	}
	// public boolean

	private boolean compare(String string, String pivotVal) {
		// TODO Auto-generated method stub
		if(string.length()>pivotVal.length())
			return true;
		else if(string.length()==pivotVal.length()) {
			if(string.compareTo(pivotVal) >= 0)
				return true;
			return false;
			
		}else
		return false;
	}

}
