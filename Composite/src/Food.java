
public class Food extends Entry {
	
	private String name;
	private int weight;

	public Food(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void add(Entry entry) {
		System.out.println("음식에는 추가할 수 없습니다.");
	}

	@Override
	public void showList() {
		System.out.println(name);
	}
	
}
