package pac7;

public class FindtheIndexoftheFirstOccurrenceinaString {
	public int strStr(String haystack, String needle) {
        for(int i=0;;i++){
            for(int j=0;;j++){
                if(j==needle.length())return i;
                if(j+i==haystack.length())return -1;
                if(needle.charAt(j)!=haystack.charAt(j+i))break;
            }
        }
        
    }

}
