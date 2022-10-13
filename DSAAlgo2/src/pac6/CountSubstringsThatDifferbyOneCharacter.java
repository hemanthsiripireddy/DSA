package pac6;

public class CountSubstringsThatDifferbyOneCharacter {
	public int countSubstrings(String s, String t) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                int count=0;
                for(int k=0;k+i<s.length()&&k+j<t.length();k++){
                    if(s.charAt(k+i)!=t.charAt(k+j)&&++count>1){
                        break;
                    }
                    ans+=count;
                }
            }
        }
        return ans;
        
    }

}
