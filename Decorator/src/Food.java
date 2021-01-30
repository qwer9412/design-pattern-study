
public class Food extends Item {
	
	private String foodName;
	
	public Food(String foodName) {
		this.foodName = foodName;
	}

	@Override
	public int getColumns() {
		return foodName.length();
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public String getRowText(int row) {
		return foodName;
	}

}
