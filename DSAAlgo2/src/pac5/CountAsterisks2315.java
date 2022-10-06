package pac5;

public class CountAsterisks2315 {
	public int countAsterisks(String s) {
        int count=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                count=(count+1)%2;
                continue;
            }
            if(s.charAt(i)=='*'&&count==0)
            ans++;
        }
        return ans;
        
    }

}
