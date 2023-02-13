package quickSortPattern;

public class KClosestPointstoOrigin {
	int[][] res;

	public int[][] kClosest(int[][] points, int k) {
		int l = points.length;
		double[] dist = new double[l];
		for (int i = 0; i < l; i++) {
			int x = points[i][0];
			int y = points[i][1];
			x = x * x;
			y = y * y;
			dist[i] = Math.sqrt(x + y);
		}
		res = new int[k][2];
		quickSort(dist, points, 0, l - 1, k);
		return res;

	}

	public void quickSort(double[] dist, int[][] points, int start, int end, int k) {
		if (start > end)
			return;
		int pivot = sort(dist, points, start, end);
		if (pivot == k - 1) {

			for (int i = 0; i < k; i++) {
				res[i][0] = points[i][0];
				res[i][1] = points[i][1];
			}

		} else if (pivot > k - 1) {
			quickSort(dist, points, start, pivot - 1, k);
		} else {
			quickSort(dist, points, pivot + 1, end, k);

		}
	}

	public int sort(double[] dist, int[][] points, int start, int end) {

		double pivotVal = dist[end];
		int pivotPost = start;
		for (int i = start; i <= end; i++) {
			if (dist[i] <= pivotVal) {
				double temp = dist[pivotPost];
				dist[pivotPost] = dist[i];
				dist[i] = temp;

				int[] temp1 = points[pivotPost];
				points[pivotPost] = points[i];
				points[i] = temp1;
				pivotPost++;
			}
		}
		return pivotPost - 1;
	}

}
