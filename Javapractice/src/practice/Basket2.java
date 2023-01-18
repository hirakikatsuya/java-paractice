package practice;

public class Basket2<E extends Fruit> {
	private E elem;

	Basket2(E e) {
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}

	void printName() {
		System.out.println("かごの中身は" + elem.getName() + "です");
	}

	public static void main(String[] args) {
		Basket2<Orange> orangeBasket = new Basket2<>(new Orange("デコポン"));
		orangeBasket.printName();
	}
}

abstract class Fruit {
	String name;

	Fruit(String name) {
		this.name = name;
	}

	abstract protected String getName();
}

class Orange extends Fruit {
	Orange(String name) {
		super(name);
	}

	@Override
	protected String getName() {
		return name;
	}
}