
public class BarObserver implements Observer {

	@Override
	public void update(NumberGenerator numberGenerator) {
		int num = numberGenerator.getNum();

		System.out.print("new bar : ");
		for (int i = 0; i < num; i++) {
			System.out.print("|");
		}
		System.out.println("");
	}
}
