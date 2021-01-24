import java.util.ArrayList;
import java.util.List;

public class Plate extends Entry {

	private String name;
	private List<Entry> entryList;
	
	public Plate(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getWeight() {
		if (entryList == null) {
			return 0;
		}
		
		int totalWeight = 0;
		for (Entry entry : entryList) {
			totalWeight += entry.getWeight();
		}
		return totalWeight;
	}

	@Override
	public void add(Entry entry) {
		if (entryList == null) {
			entryList = new ArrayList<>();
		}
		
		entryList.add(entry);
	}

	@Override
	public void showList() {		
		if (entryList == null) {
			return;
		}
		
		for (Entry entry : entryList) {
			entry.showList();
		}
	}

}
