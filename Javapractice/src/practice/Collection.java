package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {
	public static void main(String[]args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<String> prefectures = new ArrayList<String>();
		
		list1.add("りんご");
		list1.add("みかん");
		list1.add(1,"バナナ");
		System.out.println(list1.get(0));
		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.contains("なし"));
		list1.remove("バナナ");
		list1.remove("なし");
		System.out.println(list1.get(1));//みかんを出力
		list1.remove(0);
//		list1.remove(5);要素数より大きいためエラー
		System.out.println(list1.get(0));//みかんを出力

		list2.add(12345);
		list2.add(99999);
		list2.add(1,77777);
		System.out.println(list2.get(2));
		System.out.println(list2.contains(99999));
		System.out.println(list2.contains(555));
		
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");
		for (String prefecture : prefectures) {
			  System.out.println(prefecture); 
		}
	}
}
