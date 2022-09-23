package pac2;

public class ExcelSheetColumnNumber {
	 public int titleToNumber(String columnTitle) {
	        int sum=0,l=columnTitle.length();
	        for(int i=0;i<l;i++){
	            int num=columnTitle.charAt(i)-'A'+1;
	            sum+=Math.pow(26,l-i-1)*num;
	        }
	        return sum;

}
}
