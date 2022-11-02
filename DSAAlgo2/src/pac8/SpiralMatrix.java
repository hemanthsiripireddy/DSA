package pac8;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	 public List<Integer> spiralOrder(int[][] matrix) {
	        int tr=0,br=matrix.length-1,lc=0,rc=matrix[0].length-1;
	        List<Integer>list=new ArrayList<>();
	        int i=0,j=0;
	        while(tr<=br&&lc<=rc){
	            while(true){
	            if(j<=rc&&i>=tr&&i<=br){
	                 list.add(matrix[i][j]);
	                j++;
	                
	            }
	            else{
	                tr++;
	                j--;
	                i++;
	                break;

	            }
	           

	        }
	        while(true){
	            if(i<=br&&j>=lc&&j<=rc){
	                list.add(matrix[i][j]);
	                i++;

	            }
	            else{
	                rc=rc-1;
	                i--;
	                j--;
	                break;
	            }

	        }
	         while(true){
	            if(j>=lc&&i>=tr&&i<=br){
	                list.add(matrix[i][j]);
	                j--;

	            }
	            else{
	                br--;;
	                j++;
	                i--;
	                break;
	            }

	        }
	         while(true){
	            if(i>=tr&&j>=lc&&j<=rc){
	                list.add(matrix[i][j]);
	                i--;

	            }
	            else{
	                lc++;;
	                i++;
	                j++;
	                
	                break;
	            }

	        }

	        }
	        return list;
	        
	    }

}
