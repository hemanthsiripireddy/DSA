package pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int it=1;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("* ");
			}
			int m=it;
			
				for(int v=1;v<=it;v++) {
					System.out.print(m+" ");
					m++;
				}
				m--;
				for(int v=it-1;v>=1;v--) {
					m--;
					System.out.print(m+" ");
				}
				
				
			
			it++;
			for(int j=1;j<=i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
