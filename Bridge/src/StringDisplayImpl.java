
public class StringDisplayImpl extends DisplayImpl {

	private String str;
	
	public StringDisplayImpl(String str) {
		this.str = str;
	}
	
	@Override
	public void start() {
		System.out.println(">>start");
	}

	@Override
	public void print() {
		System.out.println(str);
	}

	@Override
	public void finish() {
		System.out.println(">>finish");
	}
}
