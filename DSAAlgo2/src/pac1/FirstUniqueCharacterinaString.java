package pac1;

public class FirstUniqueCharacterinaString {
	public String addStrings(String num1, String num2) {
        String s="";
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        while(i>=0&&j>=0){
            int x=Integer.parseInt(num1.charAt(i)+"");
            int y=Integer.parseInt(num2.charAt(j)+"");
            int z=(x+y+carry)%10;
           
            s+=z;
            carry=(x+y+carry)/10;
            i--;
            j--;
            
            
        }
       // int l=Math.max(num1.length(),num2.length())
            while(i>=0){
                 int x=Integer.parseInt(num1.charAt(i)+"");
          
            int z=(x+carry)%10;
           
            s+=z;
            carry=(x+carry)/10;
            i--;
            
                
            }
         while(j>=0){
                 int x=Integer.parseInt(num2.charAt(j)+"");
          
            int z=(x+carry)%10;
           
            s+=z;
            carry=(x+carry)/10;
            j--;
            
                
            }
        
        if(carry!=0)
            s+=carry;
         StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(s);
  
        // reverse StringBuilder input1
        input1.reverse();
        return input1+"";
        
    }

}
