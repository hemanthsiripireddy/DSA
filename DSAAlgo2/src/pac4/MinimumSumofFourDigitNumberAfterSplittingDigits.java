package pac4;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
	public int minimumSum(int num) {
        int[] digitArray=new int[4];
        int i=0;
        while(num>0){
            digitArray[i++]=num%10;
            num/=10;
        }
        Arrays.sort(digitArray);
        return digitArray[0]*10+digitArray[2]+digitArray[1]*10+digitArray[3];
        
    }

}
