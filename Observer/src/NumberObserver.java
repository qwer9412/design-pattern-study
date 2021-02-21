
public class NumberObserver implements Observer {

	@Override
	public void update(NumberGenerator numberGenerator) {
		System.out.println("new num : " + numberGenerator.getNum());
	}
}
