
public class Chapter05 {
	public static void main(String[] args) {

		long long1 = 12345678987654321L;
		System.out.println(long1);

		double double1 = 1.23d;
		System.out.println(double1);

		boolean boolean1 = true;
		System.out.println(boolean1);

		Float float1 = Float.valueOf(4.44f);
		System.out.println(float1);

		Integer integer1 = Integer.valueOf(10000);
		System.out.println(integer1);

		Character character1 = Character.valueOf('あ');
		System.out.println(character1);

		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		System.out.println(array1[2]);
 	}
}
