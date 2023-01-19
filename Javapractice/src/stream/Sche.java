package stream;

import java.time.LocalDate;

//Comparableインタフェースを実装する
public class Sche implements Comparable<Sche> {
private LocalDate date;
private String list;
private boolean done; //追加

public Sche(LocalDate date, String list, boolean done) {
 this.date = date;
 this.list = list;
 this.done = done;
}

public LocalDate getDate() {
 return date;
}

public String getList() {
 return list;
}

// boolean型のgetterメソッドはis～とする事もあります
public boolean isDone() {
 return done;
}

// compareToメソッドをオーバーライドする
// 日付で並び替えるため、LocalDateのcompareToを使う
@Override
public int compareTo(Sche t) {
 return date.compareTo(t.date);
}

@Override
public String toString() {
 return date + ":" + list + ":" + done + "]";
}
}
