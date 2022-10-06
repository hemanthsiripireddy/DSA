package pac5;

import java.util.Arrays;

public class RearrangeWordsinaSentence {
	  public String arrangeWords(String text) {
	        String strArray[] = text.split(" ");
	          strArray[0]=strArray[0].substring(0,1).toLowerCase()+""+strArray[0].substring(1);
	        Arrays.sort(strArray,(a,b)->a.length()-b.length());
	        strArray[0]=strArray[0].substring(0,1).toUpperCase()+""+strArray[0].substring(1);
	        text="";
	        for(int i=0;i<strArray.length;i++){
	            if(i!=strArray.length-1){
	                text+=strArray[i]+" ";
	            }
	            else{
	                text+=strArray[i];
	            }
	        }
	        return text;
	        
	    }
}
