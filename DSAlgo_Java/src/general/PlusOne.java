package general;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		  
        boolean add=true;
        for(int i=digits.length-1;i>=0;i--){
            if(add){
             digits[i]+=1;
                add=false;
                
            }
            if(digits[i]==10){
                digits[i]=0;
                add=true;
            }
            
        }
        if(add){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for(int i=0;i<digits.length;i++){
                arr[i+1]=digits[i];
                
            }
            digits=arr;
        }
        return digits;
        
		
	}
}