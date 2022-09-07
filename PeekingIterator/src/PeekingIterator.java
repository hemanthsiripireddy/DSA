import java.util.Iterator;

public class PeekingIterator<T> implements Iterator<T>{
	private T peek;
	private Iterator<T>iterator;

	public PeekingIterator(Iterator<T> iterator) {
		
		this.iterator = iterator;
		if(this.iterator.hasNext()) {
			this.peek=iterator.next();
		}
		else {
			this.peek=null;
		}
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.peek!=null;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		if(this.peek==null)
			return null;
		T result=this.peek;
		if(iterator.hasNext()) {
			this.peek=iterator.next();
		}
		else {
			this.peek=null;
		}
		return result;
	}
	public T peek() {
		return this.peek;
	}

}
