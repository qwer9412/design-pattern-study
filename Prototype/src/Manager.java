import java.util.HashMap;

public class Manager {
	private HashMap showcase = new HashMap();
	
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	
	public Product create(String name) {
		Product product = (Product)showcase.get(name);
		return product.createClone();
	}
}
