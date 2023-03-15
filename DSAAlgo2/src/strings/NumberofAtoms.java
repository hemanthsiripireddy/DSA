package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberofAtoms {
	static int i = 0;
	public static void method() {
		String str="Mg(OH)2";
		String res=countOfAtoms(str);
		System.out.println(res);
	}

	public static String countOfAtoms(String formula) {
		Map<String, Integer> res = rec(formula);
		List<Hem> list = new ArrayList<>();
		for (Map.Entry<String, Integer> it : res.entrySet()) {
			list.add(new Hem(it.getKey(), it.getValue()));

		}
		Collections.sort(list, new Comparator<Hem>() {

			public int compare(Hem o1, Hem o2) {
				return o1.str.compareTo(o2.str);
			}
		});
		String ans = "";
		for (int i = 0; i < list.size(); i++) {
			ans = ans + list.get(i).str;
			if (list.get(i).count != 1) {
				ans = ans + list.get(i).count;
			}

		}
		return ans;

	}

	public static Map<String, Integer> rec(String str) {
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> temp = null;
//Mg(OH)2
		while (i < str.length()) {
			String s = "";
			int num = 0;
			if (i < str.length() && ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))) {
				s = s + str.charAt(i++);
				while(i < str.length() && ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))) {
					s = s + str.charAt(i++);
					
				}
			}
			while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num = num * 10 + (str.charAt(i++) - '0');
			}
			if (!s.equals("")) {
				if (num == 0)
					num = 1;
				map.put(s, map.getOrDefault(s, 0) + num);

			}

			if (i < str.length() && str.charAt(i) == '(') {
				i++;
				temp = rec(str);
				if (temp != null) {
					for (Map.Entry<String, Integer> it : temp.entrySet()) {
						int val1 = it.getValue();
						map.put(it.getKey(), map.getOrDefault(it.getKey(), 0) + val1);

					}
				}

			}
			if (i < str.length() && str.charAt(i) == ')') {
				i++;
				int val = 0;
				while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					val = val * 10 + (str.charAt(i++) - '0');

				}
				if (val == 0)
					val = 1;
				if (map != null) {
					for (Map.Entry<String, Integer> it : map.entrySet()) {
						int val1 = it.getValue() * val;
						map.put(it.getKey(), val1);

					}
				}
				return map;
			}
		}
		return map;
	}

}
