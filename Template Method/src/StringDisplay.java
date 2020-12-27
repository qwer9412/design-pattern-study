
public class StringDisplay extends AbstractDisplay {
	private String str;
	private int len;
	
	public StringDisplay(String str) {
		this.str = str;
		len = str.getBytes().length;
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + str + "|");
	}

	@Override
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i=0;i<len;i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
}
