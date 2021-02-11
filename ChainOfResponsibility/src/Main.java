
public class Main {
	public static void main(String[] args) {
		Check limit20 = new LimitCheck("limit20", 20);
		Check odd = new OddCheck("odd");
		Check notAllow11 = new NotAllowNumCheck("notAllow11", 11);
		
		odd.setNext(limit20).setNext(notAllow11);
		
		for (int i=1;i<=23;i++) {
			odd.validCheck(i);
		}
	}
}
