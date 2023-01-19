package stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OChapter7 {
	  public static void main(String[] args) throws Exception {
	    List<Sche> list = new ArrayList<>();
	    list.add(new Sche(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
	    list.add(new Sche(LocalDate.of(2021, 9, 15), "○○社面接", false));
	    list.add(new Sche(LocalDate.of(2021, 12, 4), "手帳を買う", true));
	    list.add(new Sche(LocalDate.of(2021, 8, 10), "散髪に行く", false));
	    list.add(new Sche(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

	    long count = list.stream()
	        .filter(t -> !t.isDone())
	        .count();
	    System.out.println(count);

	    List<Sche> newList = list.stream()
	    	.filter(t -> !t.isDone())
	        .sorted()
	        .collect(Collectors.toList());
	    newList.forEach(System.out::println);
	  }
	}
