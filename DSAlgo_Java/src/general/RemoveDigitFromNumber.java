package general;

import java.math.BigInteger;

public class RemoveDigitFromNumber {
	public static String removeStringOptimisedMethod(String number,char digit) {
		
		int last=number.length()-1;
		for(int i=0;i<number.length()-1;i++) {
		
			if(number.charAt(i)==digit) {
				char charAt=number.charAt(i),charNext=number.charAt(i+1);
				if(charAt>=charNext) {
					last=i;
				}
				else
				return number.substring(0,i)+number.substring(i+1);
			}
					
				
			
		}
		 last=number.charAt(number.length()-1)==digit?number.length()-1:last;
		return number.substring(0,last)+number.substring(last+last);
	
			
	}
	public static String removeString(String number,char digit) {
		int k=0;
		BigInteger max = new BigInteger("0");
	for(int i=0;i<number.length();i++) {
		
		if(number.charAt(i)==digit) {
			
			BigInteger num = new BigInteger(number.substring(0,i)+number.substring(i+1));
			
			//int num=Integer.parseInt();
			if(num.compareTo(max) > 0) {
				max=num;
				k=i;
			}
			
			
		}
		
	}
	return number.substring(0,k)+number.substring(k+1);
		
	}

}
//BigInteger myBigInteger = new BigInteger
