

import java.util.Scanner;



 class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner( System.in );
		int a = myInput.nextInt();
		int[] array=new int[a];
		for(int i=0;i<a;i++) {
			array[i]=myInput.nextInt();
		}
		for(int i=0;i<a;i++) {
			crosses(array[i]);
		}
		

	}
	public static void crosses(int a) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(j==i ||j==a-i-1) {
					System.out.print("\\/");
					
				
				}
				
					else
						System.out.print("  ");
					
				
				
			}
			System.out.println();
			for(int j=0;j<a;j++) {
				if(j==i ||j==a-i-1) {
					System.out.print("/\\");
					
				
				}
				
					else
						System.out.print("  ");
					
				
				
			}
			System.out.println();
		}
		
	}

}
