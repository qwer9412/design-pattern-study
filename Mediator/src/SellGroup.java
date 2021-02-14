import java.util.Comparator;
import java.util.PriorityQueue;

public class SellGroup {
	private Mediator mediator;
	public PriorityQueue<Stock> sellerList;
	
	public SellGroup() {
		sellerList = new PriorityQueue<Stock>(10, new Comparator<Stock>() {

			@Override
			// �� ���ݿ� �� ����� �켱��
			public int compare(Stock arg0, Stock arg1) {
				if (arg0.getPrice() == arg1.getPrice()) {
					return 0;
				}
				
				return arg0.getPrice() > arg1.getPrice() ? 1 : -1;
			}
		});
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void add(Stock stock) {
		sellerList.add(stock);
		mediator.deal();
	}
}
