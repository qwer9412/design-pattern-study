
public class Display {
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void start() {
		impl.start();
	}
	
	public void print() {
		impl.print();
	}
	
	public void finish() {
		impl.finish();
	}
	
	public void myPrint() {
		start();
		print();
		finish();
	}
}
