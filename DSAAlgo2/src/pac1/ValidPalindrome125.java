package pac1;

public class ValidPalindrome125 {
	public boolean isPalindrome(String s) {
        String newStr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newStr+=ch;
            }
        }
        newStr=newStr.toLowerCase();
        int i=0,j=newStr.length()-1;
        while(i<=j){
            if(newStr.charAt(i)==newStr.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }

}
