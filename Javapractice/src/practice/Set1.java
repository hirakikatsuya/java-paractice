package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");

		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));
		System.out.println(set1.size());
		set1.remove("スイカ");
		set1.remove("なし"); // 何もならない
		System.out.println(set1.contains("スイカ"));

		set2.add(123);
		set2.add(555);
		System.out.println(set2.contains(555));
	}
}
