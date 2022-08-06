package general;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class ReverseIntegerBits {
//	public static int convertBintoInt(String s) {
//		int l=s.length()-1;
//		while(l>=0) {
//		
//	}
	public static int reverseBinary(int n) {
		//String r="";
		int binaryNumber=0;
        for(int i=0;i<32;i++){
            binaryNumber=binaryNumber<<1;
            binaryNumber=binaryNumber+(n&1);
            n=n>>1;
        }
        return binaryNumber;
        
	}
	//public static 
	
	}


