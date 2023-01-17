package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		Map<Integer, String> classmates = new HashMap<>();

		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		map1.put(0, "マスカット");
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		System.out.println(map1.size());
		System.out.println(map1.get(3));
		map1.remove(3, "もも");
		map1.remove(3, "なし");//なにもならない
		System.out.println(map1.get(3));

		map2.put("あ", "くるま");
		map2.put("い", "自転車");
		System.out.println(map2.get("あ"));
		System.out.println(map2.containsKey("い"));
		System.out.println(map1.containsValue("くるま"));

		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");

		for (Integer key : classmates.keySet()) {
			System.out.println(key);
		}
		for (String name : classmates.values()) {
			System.out.println(name);
		}
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん");
		}
	}
}
