package pac2;
import java.util.*;

public class MainClosestSumPair {
	public static void main(String[] args) {
		int[] a1 = {-1, 3, 8, 2, 9, 5};
        int[] a2 = {4, 1, 2, 10, 5, 20};
        int aTarget = 24;
        int arr[]=new MainClosestSumPair().closestPair(a1, a2, aTarget);
        System.out.println(arr[0]+" "+arr[1]);

	}

public int[] closestPair(int[] a1,int[] a2,int target){
int[] a1Sorted=Arrays.copyOf(a1,a1.length);
Arrays.sort(a1Sorted);
int[] a2Sorted=Arrays.copyOf(a2,a2.length);
Arrays.sort(a2Sorted);
int i=0;
int j=a2Sorted.length-1;
int minDif=Math.abs(a1Sorted[0]+a2Sorted[0]-target);
int[] closestPair={a1Sorted[0],a2Sorted[0]};
while(i<a1Sorted.length&&j>=0){
int v1=a1Sorted[i];
int v2=a2Sorted[j];
int dif=v1+v2-target;
if(Math.abs(dif)<minDif){
minDif=Math.abs(dif);
closestPair[0]=v1;
closestPair[1]=v2;

}
if(dif==0)
return closestPair;
 if(dif<0){
i++;
}
else{
j--;
}



}
return closestPair;








}

}