
public class BoxingItem extends Item {
	
	private Item item;
	
	public BoxingItem(Item item) {
		this.item = item;
	}

	@Override
	public int getColumns() {
		return item.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return item.getRows() + 2;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0 || row == getRows() - 1) {
			String result = "";
			for (int i=0; i<getColumns(); i++) {
				result += '+';
			}
			return result;
		}
		
		return '+' + item.getRowText(row-1) + '+';
	}

}
