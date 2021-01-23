
public class ThreeCount {
	private Strategy strategy;
	
	public ThreeCount(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void printNextNum() {
		System.out.println(strategy.getNext());
	}
}
