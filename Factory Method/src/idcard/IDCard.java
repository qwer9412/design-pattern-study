package idcard;

import factory.Product;

public class IDCard extends Product{
	private String owner;
	private int id;
	
	IDCard (String owner, int id) {
		this.owner = owner;
		this.id = id;
		System.out.println(owner + id + "생성");
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public void use() {
		System.out.println(owner+"사용");
	}
}
