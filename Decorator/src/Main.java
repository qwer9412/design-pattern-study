
public class Main {
	public static void main(String[] args) {
		Item item1 = new Food("cake");
		Item item2 = new TapingItem(item1);
		Item item3 = new BoxingItem(item2);
		Item item4 = new BoxingItem(
						new BoxingItem(
							new TapingItem(
								new BoxingItem(
									new Food("important cake")
								)
							)
						)
					);
		
		item1.show();
		item2.show();
		item3.show();
		item4.show();
	}
}
