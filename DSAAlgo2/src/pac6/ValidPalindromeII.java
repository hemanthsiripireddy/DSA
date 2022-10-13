package pac6;

public class ValidPalindromeII {
	public boolean validPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return isPalindrom(start+1,end,s)||isPalindrom(start,end-1,s);
            }
        }
        return true;
        
    }
    public boolean isPalindrom(int start,int end,String s){
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else
            return false;
        }
        return true;
    }

}
