package pac1;

public class ArrayOperationsDemo {
	private int arr[];
	private int size;
	private int capacity;
	public ArrayOperationsDemo(int capacity) {
		
		this.capacity = capacity;
		size=0;
		arr=new int[capacity];
			
	}
	public void insertInEnd(int value) {
		if(size==capacity)
			return;
		arr[size++]=value;
	}
	public void insertAtIndex(int value,int index) {
		if(size==capacity)
			return;
		for(int i=size;i>index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		size++;
	}
	public int deleteInEnd() {
		
		int value= arr[size-1];
		size--;
		return value;
	}
	public int deleteAtIndex(int index) {
		if(index>=size)
			return -1;
		int value=arr[index];
		for(int i=index+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		return value;
		
		
	}
	public void tranversal() {
		System.out.println("Array elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public boolean serach(int value) {
		for(int i=0;i<size;i++) {
			if(arr[i]==value)
				return true;
		}
		return false;
		
	}
	public void sort() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;i++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	

}
