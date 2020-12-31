import factory.Factory;
import factory.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product product = factory.create("a");
		Product product2 = factory.create("b");
		product.use();
		product2.use();
	}

}
