package quickSortPattern;

public class KClosestPointstoOriginImpl {
	public static void method() {
		KClosestPointstoOrigin ob=new KClosestPointstoOrigin();
		int[][] points= {{9,0},{7,10},{-4,-2},{3,-9},{9,1},{-5,-1}};
		int res[][]=ob.kClosest(points, 5);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i][0]+": "+res[i][1]);
		}
	}
	

}
