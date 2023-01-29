package pac11;

import java.util.Arrays;

public class NextPermutation {
	public static void method() {
		int[] nums = new int[] { 2, 2, 3, 4, 2, 3, 1, 1, 2 };
		nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void nextPermutation(int[] nums) {
		if (nums.length == 1)
			return;
		int[] nums1 = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
		}
		Arrays.sort(nums1);
		boolean isDec = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums1[nums1.length - 1 - i] != nums[i]) {
				isDec = false;
				break;
			}

		}
		if (isDec) {
			int start = 0, end = nums.length - 1;
			while (start < end) {
				int temp = nums[start];
				nums[start++] = nums[end];
				nums[end--] = temp;

			}
			return;
		}

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				int val = findNext(nums, i);
				for (int j = i; j < nums.length; j++) {
					if (val == nums[j]) {
						nums[j] = nums[i - 1];
						nums[i - 1] = val;

						break;
					}
				}
				sort(nums, i);
				break;

			}
		}

	}

	public static void sort(int[] nums, int i) {
		int[] nums2 = new int[nums.length - i];
		int it = 0;
		for (int j = i; j < nums.length; j++) {
			nums2[it++] = nums[j];
		}
		Arrays.sort(nums2);
		it = 0;
		for (int j = i; j < nums.length; j++) {
			nums[j] = nums2[it++];

		}
	}

	public static int findNext(int[] nums, int it) {
		int ans = nums[it];
		for (int i = it; i < nums.length; i++) {
			if (nums[i] > nums[it - 1])
				ans = Math.min(ans, nums[i]);

		}
		return ans;
	}

}
