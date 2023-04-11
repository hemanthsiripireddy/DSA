package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<String>list=new ArrayList<>();
	//	Arrays.f
		list.add("ab");
		list.add("ba");
		list.add("ab");
		Comparator c1=new Comparator<String>() {
			public int compare(String s1,String s2) {
				
				if(s1.compareTo(s2)>0)
					return -1;
				else
					return 1;
			}
		};
		Collections.sort(list,c1);
		for(String s:list)
			System.out.println(s);
		
		
		
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
