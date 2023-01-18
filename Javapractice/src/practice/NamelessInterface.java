package practice;

public class NamelessInterface implements B {

	@Override
	public String hello() {
		return "Hello B!";
	}

	public static void main(String[]args) {
		B b = new NamelessInterface();
		System.out.println(b.hello());
	}
}

interface B{
	public String hello();
}