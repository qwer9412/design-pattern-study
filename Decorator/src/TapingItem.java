
public class TapingItem extends Item {
	
	private Item item;
	
	public TapingItem(Item item) {
		this.item = item;
	}

	@Override
	public int getColumns() {
		return item.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return item.getRows();
	}

	@Override
	public String getRowText(int row) {
		return '|' + item.getRowText(row) + '|';
	}

}
