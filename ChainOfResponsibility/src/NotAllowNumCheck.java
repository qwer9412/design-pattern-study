
public class NotAllowNumCheck extends Check {
	
	private int notAllowNum;

	public NotAllowNumCheck(String name, int notAllowNum) {
		super(name);
		this.notAllowNum = notAllowNum;
	}

	@Override
	protected boolean isValid(int num) {
		return num != notAllowNum;
	}

}
