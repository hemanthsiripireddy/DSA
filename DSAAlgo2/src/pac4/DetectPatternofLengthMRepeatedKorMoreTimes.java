package pac4;

public class DetectPatternofLengthMRepeatedKorMoreTimes {
	public boolean containsPattern(int[] arr, int m, int k) {
        int count=0;
        for(int i=0,j=i+m;j<arr.length;i++,j++){
            if(arr[i]!=arr[j])count=0;
            else if(++count==(k-1)*m)return true;
        }
        return false;
        
    }

}
