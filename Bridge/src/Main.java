
public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("test"));
		d1.myPrint();
		
		MultiDisplay d2 = new MultiDisplay(new StringDisplayImpl("test2"));
		d2.myMultiPrint(2);
	}
}
