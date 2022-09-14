package pac2;

public class RecursiveStairCase {
	public int recursiveStairCase(int n,int[] numOfSteps) {
		int[] arr=new int[n+1];
		arr[0]=1;arr[1]=1;
		for(int i=2;i<=n;i++) {
			int total=0;
			for(int j=0;j<numOfSteps.length;j++) {
				if(i-numOfSteps[j]>=0)
					total+=arr[i-numOfSteps[j]];
			}
			arr[i]=total;
			
			
			
		}
		return arr[n];
		
	}

}
