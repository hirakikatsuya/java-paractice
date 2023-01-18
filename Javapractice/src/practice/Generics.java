package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Generics {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		items.add("bag");
		String item = items.get(0);
		System.out.println(item);

		Set<Integer> sets = new LinkedHashSet<>();
		sets.add(12345);
		System.out.println(sets.contains(12345));

		Map<Integer, String> map = new HashMap<>();
		map.put(1010, "あああ");
		System.out.println(map.get(1010));
	}
}
