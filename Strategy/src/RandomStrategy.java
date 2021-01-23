import java.util.Random;

public class RandomStrategy implements Strategy {

	@Override
	public int getNext() {
		Random random = new Random();
		return random.nextInt(3);
	}
}
