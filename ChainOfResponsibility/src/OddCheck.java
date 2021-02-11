
public class OddCheck extends Check {

	public OddCheck(String name) {
		super(name);
	}

	@Override
	protected boolean isValid(int num) {
		return num % 2 == 1;
	}

}
