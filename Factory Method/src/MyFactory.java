

import java.util.ArrayList;
import java.util.List;

public class MyFactory extends MyAbstractFactory {
	private List<String> owners = new ArrayList<>();

	public List<String> getOwners() {
		return owners;
	}
	
	@Override
	protected Product createProduct(String owner) {
		return new Product(owner);
	}
		
	@Override
	protected void registerProduct(Product product) {
		owners.add(((Product)product).getOwner());
	}
}
