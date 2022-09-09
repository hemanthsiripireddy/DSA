package pac1;

public class DynamicArray {
	private int[] arr;
	private int size;
	private int capacity;
	public DynamicArray(int capacity) {
		
		this.arr = new int[capacity];
		this.size = 0;
		this.capacity = capacity;
	}
	public void insert(int value) {
		if(size==capacity) {
			growArray();
		}
		arr[size++]=value;
	}
	public int delete(int index) {
		int deletedNumber=this.arr[index];
		for(int i=index+1;i<size;i++) {
			this.arr[i-1]=this.arr[i];
		}
		size--;
		return deletedNumber;
	}
	public  void growArray() {
		int[] tempArray=new int[2*size];
		for(int i=0;i<size;i++) {
			tempArray[i]=arr[i];
		}
		this.arr=tempArray;
		this.capacity=2*size;
		
	}
	public void display() {
		System.out.println("array with size: "+size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\narray with capacity; "+capacity);
		for(int i=0;i<capacity;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
