package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopImpl {
	public static void method() {
		List<Laptop> laps=new ArrayList<>();
		laps.add(new Laptop("hp",23.4,12));
		laps.add(new Laptop("dell",12.4,23));
		laps.add(new Laptop("hp",43.2,2));
		laps.add(new Laptop("hp",8,42));
		laps.add(new Laptop("hp",8,42));
		
		
		Comparator com=new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				 	if(o1.getRam()>o2.getRam())
				 		return -1;
				 	return 1;
			}
			
		};
		Collections.sort(laps,com);
		for(Laptop l:laps) {
			System.out.println(l.toString());
		}
	}

}
