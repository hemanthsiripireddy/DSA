package pac9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer>list=new ArrayList<>();
        //int l=Math.min(nums1.length,nums2.length);
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;

            }
            else{
                j++;
            }

        }
        return   list.stream().mapToInt(k -> k).toArray();
        
    }

}
