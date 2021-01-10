public class Main {

	public static void main(String[] args) {
		MyAbstractFactory factory = new MyFactory();
		Product product = factory.create("a");
		Product product2 = factory.create("b");
		product.use();
		product2.use();
	}

}
