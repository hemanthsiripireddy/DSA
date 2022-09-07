import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>lst=new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		Iterator<Integer>iterator=lst.iterator();
		PeekingIterator<Integer>pi=new PeekingIterator<>(iterator);
		while(pi.hasNext()) {
			System.out.println(pi.peek());
			pi.next();
		}
		

	}

}
