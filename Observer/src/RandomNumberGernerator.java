import java.util.Random;

public class RandomNumberGernerator extends NumberGenerator {

	private Random random = new Random();
	private int lastNum;

	public RandomNumberGernerator(int lastNum) {
		super();
		this.lastNum = lastNum;
	}

	@Override
	public void execute() {
		this.num = random.nextInt(lastNum + 1);
		notifyObserver();
	}
}
