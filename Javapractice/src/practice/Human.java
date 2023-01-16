package practice;

public class Human{
	public class Foot{
		public void kick() {
			System.out.println("蹴る");
		}
	}

	public static void main(String[]args) {
		Human human = new Human();
		Human.Foot leg = human.new Foot();
		leg.kick();
	}
}