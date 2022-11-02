package pac8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	 public int[][] merge(int[][] intervals) {
	        for(int i=0;i<intervals.length;i++){
	            for(int j=i+1;j<intervals.length;j++){
	                if(intervals[i][0]>intervals[j][0]){
	                    int[] temp=intervals[i];
	                    intervals[i]=intervals[j];
	                    intervals[j]=temp;
	                }
	            }
	        }
	        List<List<Integer>>list=new ArrayList<>();
	        int start=intervals[0][0],end=intervals[0][1];
	          if(0==intervals.length-1){
	                     list.add( Arrays.asList(start,end));
	                }
	        for(int i=1;i<intervals.length;i++){
	            if(end<intervals[i][0]){
	                list.add( Arrays.asList(start,end));
	                start=intervals[i][0];
	                end=intervals[i][1];
	                 if(i==intervals.length-1){
	                     list.add( Arrays.asList(start,end));
	                }
	            }else{
	                end=Math.max(end,intervals[i][1]);
	                if(i==intervals.length-1){
	                     list.add( Arrays.asList(start,end));
	                }
	            }

	        }
	        return list.stream()
	                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
	                .toArray(int[][]::new);

	    }

}
