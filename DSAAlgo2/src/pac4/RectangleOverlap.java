package pac4;

public class RectangleOverlap {
	 public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	        int[] minRec,maxRec;
	        if(rec1[0]<rec2[0]){
	            minRec=rec1;
	            maxRec=rec2;
	            
	        }
	        else{
	            minRec=rec2;
	            maxRec=rec1;
	        }
	        if(maxRec[0]<minRec[2]&&((maxRec[1]<=minRec[1]&&maxRec[3]>minRec[1])||(maxRec[1]>=minRec[1]&&maxRec[1]<=minRec[3])))
	            return true;
	          return false;   
	        
	        
	    }
}
