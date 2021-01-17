
public class MultiDisplay extends Display {

	public MultiDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void myMultiPrint(int cnt) {
		start();
		for(int i=0;i<cnt;i++) {
			print();
		}
		finish();
	}
}
