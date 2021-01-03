
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderlinePen underLinePen = new UnderlinePen('~');
		MessageBox starBox = new MessageBox('*');
		MessageBox slashBox = new MessageBox('/');
		
		manager.register("underline", underLinePen);
		manager.register("starBox", starBox);
		manager.register("slashBox", slashBox);
		
		Product p1 = manager.create("underline");
		p1.use("Hello world");
		Product p2 = manager.create("starBox");
		p2.use("Hello world");
		Product p3 = manager.create("slashBox");
		p3.use("Hello world");
	}

}
