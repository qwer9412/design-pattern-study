
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
			System.out.println("매수자가 없습니다.");
			return;
		}
		
		if (sellGroup.sellerList.size() == 0) {
			System.out.println("매도자가 없습니다.");
			return;
		}
		
		Stock buyer = buyGroup.buyerList.peek();
		Stock seller = sellGroup.sellerList.peek();
		if (buyer.getPrice() < seller.getPrice()) {
			System.out.println("거래 가능한 경우가 없습니다.");
			return;
		}
		
		buyGroup.buyerList.remove();
		sellGroup.sellerList.remove();
		System.out.println(buyer.getName() +"와 " + seller.getName() + "의 거래가 성사되었습니다.");
	}
}
