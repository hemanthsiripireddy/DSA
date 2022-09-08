package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AngelTriplet {
public static ArrayList<List<Integer>> tripletCalc(int n,int[] arr) {
	HashSet<ArrayList<Integer>>hs=new HashSet<>();
	ArrayList<List<Integer>>lst=new ArrayList<List<Integer>>();
	Arrays.sort(arr);
	for(int i=0;i<n-2;i++) {
		int l=i+1,r=n-1;
		while(l<r) {
			int sum=arr[i]+arr[l]+arr[r];
			if(sum==0) {
				ArrayList<Integer>lst1=new ArrayList<Integer>();
				lst1.add(arr[i]);
				lst1.add(arr[l]);
				lst1.add(arr[r]);
				if(hs.add(lst1)) {
					lst.add(lst1);
					
				}
				l++;
				r--;
				
			}else if(sum<0) {
				l++;
			}else
			{
				r--;
			}
		}
	}
	return lst;
	
}
}
