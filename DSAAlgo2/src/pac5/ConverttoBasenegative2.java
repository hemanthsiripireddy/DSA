package pac5;

public class ConverttoBasenegative2 {
	public String baseNeg2(int n) {
        StringBuilder s=new StringBuilder();
        while(n!=0){
            s.append(n&1);
             n=-(n>>1);
        }
        return s.length()>0?s.reverse().toString():"0";
        
    }

}
