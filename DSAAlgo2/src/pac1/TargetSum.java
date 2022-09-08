package pac1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TargetSum {
	public static void targetSum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter values of array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter targer value");
		int target=sc.nextInt();
		int[] val=func(n,arr,target);
		System.out.println(val[0]+": "+val[1]);
		
	}
	public static int[] func(int n, int[] arr,int target) {
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(target-arr[i])) {
				return new int[] {map.get(target-arr[i]),i};
			}else {
				map.put(arr[i], i);
			}
		}
		return null;
	}

}
