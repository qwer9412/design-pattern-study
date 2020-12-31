package idcard;

import java.util.ArrayList;
import java.util.List;

import factory.Factory;
import factory.Product;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<>();
	private int id = 100;

	public List<String> getOwners() {
		return owners;
	}
	
	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, id++);
	}
		
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
}
