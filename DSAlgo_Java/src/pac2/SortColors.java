package pac2;

public class SortColors {
	public void sortColors(int[] nums) {
        int count1=0,count2=0,count3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count1++;
            else if(nums[i]==1)
                count2++;
            else 
                count3++;
        }
        int i=0;
        while(count1>0){
            nums[i]=0;
            count1--;
            i++;
        }
          while(count2>0){
            nums[i]=1;
            count2--;
              i++;
        }
        while(count3>0){
            nums[i]=2;
            count3--;
              i++;
        }
        
    }

}
