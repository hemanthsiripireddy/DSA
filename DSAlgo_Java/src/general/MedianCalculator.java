package general;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianCalculator {
	public static void medianCalculator() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int[] ans=func(n,arr);
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
		
	}
	public static int[] func(int n,int[]arr) {
		PriorityQueue<Integer>min=new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>((a,b) -> b - a); 
		int[] ans=new int[n];
		for(int i=0;i<n;i++) {
			if(max.isEmpty()||arr[i]<=max.peek()) {
				max.add(arr[i]);
				if(max.size()-min.size()>1) {
					min.add(max.poll());
				}
			}else {
				min.add(arr[i]);
				if(min.size()-max.size()>1) {
					max.add(min.poll());
				}
			}
			int size=max.size()-min.size();
			if(size==0) {
				ans[i]=(max.peek()+min.peek())/2;
			}else if(size<0) {
				ans[i]=min.peek();
			}else
				ans[i]=max.peek();
		}
		return ans;
	}

}
