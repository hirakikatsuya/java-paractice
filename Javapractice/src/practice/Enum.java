package practice;

public class Enum {
	public enum Dessert{
		APPLE(100){
			@Override
			void advertise() {
				System.out.println("まっかなりんごが"+getPrice()+"円");
			}
		},
		ICE_CREAM(200){
			@Override
			void advertise() {
				System.out.println("夏にぴったりアイスクリームが"+getPrice()+"円");
			}
		},
		CAKE(300){
			@Override
			void advertise() {
				System.out.println("みんな大好き甘いケーキが"+getPrice()+"円");
			}
		},;
		private int price;
		private Dessert(int price) {
			this.price=price;
		}
		public int getPrice() {
			return price;
		}
		abstract void advertise();
	}

	public static void main(String[]args) {
		System.out.println(Dessert.APPLE);
		Dessert iceCream = Dessert.ICE_CREAM;
		System.out.println(iceCream);
		printDessertName(Dessert.CAKE);
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
		System.out.println(Dessert.APPLE.getPrice());
		System.out.println(Dessert.ICE_CREAM.getPrice());
		System.out.println(Dessert.CAKE.getPrice());
		Dessert.APPLE.advertise();
		Dessert.ICE_CREAM.advertise();
		Dessert.CAKE.advertise();
	}

	static void printDessertName(Dessert dessert) {
		System.out.println(dessert);
	}
}
