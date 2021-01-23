
public class Main {

	public static void main(String[] args) {
		ThreeCount randomCount = new ThreeCount(new RandomStrategy());
		for(int i=0; i<3; i++) {
			randomCount.printNextNum();
		}
		
		ThreeCount sequentialCount = new ThreeCount(new SequentialStrategy());
		for(int i=0; i<3; i++) {
			sequentialCount.printNextNum();
		}
	}
}
