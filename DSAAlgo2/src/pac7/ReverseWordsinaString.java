package pac7;

public class ReverseWordsinaString {
	public String reverseWords(String s) {
        String[] arr=new String[1000];
        int j=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '&&i==0)
            {
                continue;
            }
            if(s.charAt(i)==' '&&s.charAt(i-1)==' '){
                continue;
            }
            if(s.charAt(i)!=' '){
                str.append(s.charAt(i));
            }
            if(s.charAt(i)==' '&&s.charAt(i-1)!=' '){
                arr[j++]=str.toString();
                str=new StringBuilder();
            }

        }
        if(str.length()!=0)
        arr[j++]=str.toString();
 str=new StringBuilder();
        for(int i=j-1;i>=0;i--){
            if(i!=0){
                str.append(arr[i]+" ");
            }else{
            str.append(arr[i]);
            }
            

        }
        return str.toString();
        
    }

}
