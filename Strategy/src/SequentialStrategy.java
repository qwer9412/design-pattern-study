
public class SequentialStrategy implements Strategy {

	private int value = 0;
	
	@Override
	public int getNext() {
		return (value++) % 3;
	}
}
