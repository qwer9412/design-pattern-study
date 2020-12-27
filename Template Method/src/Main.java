
public class Main {

	public static void main(String[] args) {
		AbstractDisplay a = new CharDisplay('A');
		a.display();
		
		AbstractDisplay b = new StringDisplay("Hello, word");
		b.display();
	}

}
