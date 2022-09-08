package general;

import java.util.HashSet;
import java.util.Scanner;

public class UniquepairStrings {
	public static void uniquePairs() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String left_array[]=new String[n];
		String rigth_array[]=new String[n];
		for(int i=0;i<n;i++) {
			left_array[i]=sc.next();
			rigth_array[i]=sc.next();
		}
		HashSet<String>hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			hs.add("("+left_array[i]+","+rigth_array[i]+")");
			System.out.println(hs.size());
			
		}
		
	}

}
