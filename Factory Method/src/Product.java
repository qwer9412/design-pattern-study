public class Product{
	private String owner;
	
	public Product (String owner) {
		this.owner = owner;
		System.out.println(owner + "����");
	}
	
	public String getOwner() {
		return owner;
	}

	public void use() {
		System.out.println(owner+"���");
	}
}
