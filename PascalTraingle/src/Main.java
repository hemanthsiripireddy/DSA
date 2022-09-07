import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Row data at row index 5\n"+getRowData(4));
		// TODO Auto-generated method stub

	}
	public static List<Integer> getRowData(int rowIndex){
		List<Integer>lst=new ArrayList<>();
		for(int i=0;i<=rowIndex;i++) {
			lst.add(1);
			for(int j=i-1;j>0;j--) {
				lst.set(j, lst.get(j)+lst.get(j-1));
			}
		}
		return lst;
	}

}
