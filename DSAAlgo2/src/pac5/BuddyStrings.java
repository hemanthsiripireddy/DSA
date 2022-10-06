package pac5;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
	public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
        return false;

        if(s.equals(goal)){
            Set set=new HashSet();
            for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    return true;
                }else{
                    set.add(s.charAt(i));
                }
            }
            return false;
        }
        char[] ch1=new char[2],ch2=new char[2];
        int counter=0,j=0;
      //  int str1Sum=0,str2Sum=0;
        for(int i=0;i<s.length();i++){
         
            if(s.charAt(i)!=goal.charAt(i)){
                if(j<=1){
                     ch1[j]=s.charAt(i);
                  ch2[j++]=goal.charAt(i);
                }
                 
            counter++;

            }
           
            if(counter>2){
                return false;
            }
        }
        return counter==2&&(ch1[0]==ch2[1]&&ch1[1]==ch2[0]);
        
    }

}
