
public class Main {

	public static void main(String[] args) {
		TicketMaker tichekMaker = TicketMaker.getInstance();
		int a = tichekMaker.getTichek();
		int b = tichekMaker.getTichek();
		
		System.out.print(a + " " + b);
	}

}
