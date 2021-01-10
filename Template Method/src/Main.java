
public class Main {

	public static void main(String[] args) {
		AbstractDisplay a = new CharDisplay('a');
		a.display();
		
		AbstractDisplay b = new StringDisplay("abcd");
		b.display();
	}
}
