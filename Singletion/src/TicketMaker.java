import java.util.ArrayList;
import java.util.List;

public class TicketMaker {
	private static TicketMaker tichetMaker = new TicketMaker();
	private int ticket = 1;
	
	private TicketMaker() {
	}
	
	public static TicketMaker getInstance() {
		return tichetMaker;
	}
	
	public synchronized int getTichek() {
		return ticket++;
	}
}
