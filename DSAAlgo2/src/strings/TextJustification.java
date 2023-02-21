package strings;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
	public static void method() {
		String words[] = { "What", "must", "be", "acknowledgment", "shall", "be" };
		int max = 16;
		List<String> str = fullJustify(words, max);
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		}
	}

	public static List<String> fullJustify(String[] words, int maxWidth) {
		List<String> res = new ArrayList<>();
		int i = 0;
		while (i < words.length) {
			int size = 0, gap = 0, ig = 0;
			List<String> temp = new ArrayList<>();
			int gp = 0;

			while (i < words.length) {
				if (size + words[i].length() + temp.size() <= maxWidth) {
					size += words[i].length();
					gap = temp.size();
					temp.add(words[i]);
					i++;

				} else {

					while (size + (gp + 1) * (temp.size() - 1) <= maxWidth && temp.size() != 1) {
						gp++;
						gap = gp * (temp.size() - 1);

					}
					ig = maxWidth - (size + gap);
					break;

				}
				// i++;

			}

			String gs = "", str = "";
			int it = 0, igl = 0;

			it = 0;
			while (it < gp) {
				gs += " ";
				it++;

			}
			it = 0;
			if (i == words.length) {

				gs = " ";
			}
			while (it < temp.size()) {
				str += temp.get(it);
				if (it != temp.size() - 1) {

					str += gs;
					if (igl < ig) {
						str += " ";
						igl++;
					}

				}
				it++;
			}
			int l = maxWidth - str.length();
			it = 0;
			String lgs = "";
			while (it < l) {
				lgs += " ";
				it++;

			}

			str += lgs;
			res.add(str);
		}
		return res;
	}
}
