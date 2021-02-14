import java.util.Comparator;
import java.util.PriorityQueue;

public class BuyGroup {
	private Mediator mediator;
	public PriorityQueue<Stock> buyerList;
	
	public BuyGroup() {
		buyerList = new PriorityQueue<Stock>(10, new Comparator<Stock>() {

			@Override
			// 비싼 가격에 산 사람이 우선권 가짐
			public int compare(Stock arg0, Stock arg1) {
				if (arg0.getPrice() == arg1.getPrice()) {
					return 0;
				}
				
				return arg0.getPrice() < arg1.getPrice() ? 1 : -1;
			}
		});
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void add(Stock stock) {
		buyerList.add(stock);
		mediator.deal();
	}
}
