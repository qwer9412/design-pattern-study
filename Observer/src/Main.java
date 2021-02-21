
public class Main {
	public static void main(String[] args) {
		NumberGenerator numberGenerator = new RandomNumberGernerator(50);

		numberGenerator.addObserver(new NumberObserver());
		numberGenerator.addObserver(new BarObserver());

		for (int i = 0; i < 10; i++) {
			numberGenerator.execute();
		}
	}
}
