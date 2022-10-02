package pac4;

import java.util.HashMap;
import java.util.Map;

public class emoveLetterToEqualizeFrequency {
	public boolean equalFrequency(String word) {
        for(int i=0;i<word.length()-1;i++){
            String str=word.substring(0,i)+word.substring(i+1);
            Map<Character,Integer>map=new HashMap<>();
            for(int j=0;j<str.length();j++){
                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
                
            }
            int f=-1;
            Map.Entry<Character,Integer> e=null;
            boolean ok=true;
            for(Map.Entry<Character,Integer>entry:map.entrySet()){
                if(f==-1){e=entry; f++;}
                else if(e.getValue()!=entry.getValue())ok=false;
            }
            if(ok)return true;
        }
        return false;
        
    }

}
