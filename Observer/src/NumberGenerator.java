import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

	private List<Observer> observerList;
	protected int num;

	public void addObserver(Observer observer) {
		if (observerList == null) {
			observerList = new ArrayList<>();
		}

		observerList.add(observer);
	}

	public int getNum() {
		return num;
	}

	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update(this);
		}
	}

	public abstract void execute();
}
