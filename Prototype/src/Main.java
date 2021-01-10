
public class Main {

	public static void main(String[] args) {
		MessageBox starBox = new MessageBox('*');
		MessageBox copyBox = starBox.createClone();
		
		copyBox.use("test");
	}
}
