
public class LimitCheck extends Check {
	
	private int limit;

	public LimitCheck(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean isValid(int num) {
		return num <= limit;
	}

}
