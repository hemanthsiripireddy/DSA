package general;

import java.util.HashSet;
import java.util.Scanner;

public class Sudokovalidator {
	public static void sudoko() {
		Scanner sc=new Scanner(System.in);
		char[][] arr=new char[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.next().charAt(0);
			}
			
		}
		boolean ans=func(arr);
	}
	public static boolean func(char[][]arr) {
		HashSet<String>hs=new HashSet<>();
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				char c=arr[i][j];
				if(c!='*') {
					if(!hs.add(c+"r"+i)||!hs.add(c+"c"+j)||!hs.add(c+"s"+(i/3)+'-'+(j/3))) {
						return false;
					}
				}
				
			}
		}
		return true;
	}

}
