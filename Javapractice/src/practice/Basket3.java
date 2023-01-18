package practice;

import java.math.BigDecimal;

public class Basket3<E extends Fruit2> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);

	Basket3(E e){
		elem = e;
	}
	void replace(E e) {
		elem = e;
	}
	E get() {
		return elem;
	}
	void printName() {
		System.out.println("かごの中身は"+elem.getName()+"です");
	}
	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName()+"の入ったかごは合計"+totalPrice+"円です");
	}
	public static void main(String[]args) {
		Basket3<Peach> peachBasket= new Basket3<>(new Peach("黄金桃",new BigDecimal(300)));
		peachBasket.printName();
		peachBasket.printTotalPrice();
	}
}

abstract class Fruit2 {
	String name;
	BigDecimal price;

	Fruit2(String name,BigDecimal price) {
		this.name = name;
		this.price=price;
	}
	abstract protected String getName();
	abstract protected BigDecimal getPrice();
}

class Peach extends Fruit2{
	Peach(String name,BigDecimal price){
		super(name,price);
	}
	@Override
	protected String getName() {
		return name;
	}
	@Override
	protected BigDecimal getPrice() {
		return price;
	}
}