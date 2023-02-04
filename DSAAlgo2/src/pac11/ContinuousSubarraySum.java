package pac11;

public class ContinuousSubarraySum {
	public static void method() {
		int[] arr=new int[] {23,2,4,6,6};
		System.out.println(checkSubarraySum(arr, 7));
	}
	public static boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
            	sum+=nums[j];
                if(j-i>0){
                	System.out.println(sum);
                    
                if(sum%k==0)
                return true;
                }

            }
        }
        return false;
        
    }

}
