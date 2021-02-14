
public class Mediator {
	
	private BuyGroup buyGroup;
	private SellGroup sellGroup;
	
	public Mediator(BuyGroup buyGroup, SellGroup sellGroup) {
		this.buyGroup = buyGroup;
		this.sellGroup = sellGroup;
		
		buyGroup.setMediator(this);
		sellGroup.setMediator(this);
	}
	
	public void deal() {
		if (buyGroup.buyerList.size() == 0) {
			System.out.println("�ż��ڰ� �����ϴ�.");
			return;
		}
		
		if (sellGroup.sellerList.size() == 0) {
			System.out.println("�ŵ��ڰ� �����ϴ�.");
			return;
		}
		
		Stock buyer = buyGroup.buyerList.peek();
		Stock seller = sellGroup.sellerList.peek();
		if (buyer.getPrice() < seller.getPrice()) {
			System.out.println("�ŷ� ������ ��찡 �����ϴ�.");
			return;
		}
		
		buyGroup.buyerList.remove();
		sellGroup.sellerList.remove();
		System.out.println(buyer.getName() +"�� " + seller.getName() + "�� �ŷ��� ����Ǿ����ϴ�.");
	}
}
