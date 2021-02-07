

import java.util.ArrayList;
import java.util.List;

public class Directory implements Element {
	
	private String name;
	List<Element> list;
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void add(Element element) {
		if (list == null) {
			list = new ArrayList<>();
		}
		list.add(element);
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Element> getList() {
		return list;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
