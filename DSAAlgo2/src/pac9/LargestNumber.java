package pac9;

public class LargestNumber {
	public String largestNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Long.parseLong(nums[j]+""+nums[i])>Long.parseLong(nums[i]+""+nums[j])){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                }
            }
        }
        String s="";
        for(int i=0;i<nums.length;i++){
          
            s+=nums[i];
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                s=s.substring(i+1);
                i--;

            }
            else{
                break;
            }
          

        }
        return s;
        
    }

}
