
public class Main {
	
	public static void main(String[] args) {
		BuyGroup buyGroup = new BuyGroup();
		SellGroup sellGroup = new SellGroup();
		
		Mediator mediator = new Mediator(buyGroup, sellGroup);
		
		buyGroup.add(new Stock("buyer1", 7));
		buyGroup.add(new Stock("buyer2", 7));
		sellGroup.add(new Stock("seller1", 10));
		sellGroup.add(new Stock("seller2", 6));
	}
}
