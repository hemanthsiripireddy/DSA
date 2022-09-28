package pac4;

public class MaxSumofaPairWithEqualSumofDigits {
	public int maximumSum(int[] nums) {
        int ans=-1;
        int[] arr=new int[82];int h=0;
        for(int i=0;i<nums.length;i++){
            int key=sum(nums[i]);
            if(arr[key]!=0)
                ans=Math.max(ans,arr[key]+nums[i]);
            arr[key]=Math.max(arr[key],nums[i]);
               
            
            
                
                
            }
           
            
            
            return ans;
        }
        
        
        
    
    public int sum(int value){
        int sum=0;
        while(value>0){
            sum+=value%10;
            value/=10;
        }
        return sum;
    }

}
