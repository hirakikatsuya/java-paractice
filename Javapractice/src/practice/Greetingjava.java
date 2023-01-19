package practice;

public class Greetingjava {
	@FunctionalInterface
	public interface Greeting {
		public String hello(String word);

		Greeting greeting = (String word) -> {
			System.out.println(word);
			return "こんにちは";
		};
	}
}
