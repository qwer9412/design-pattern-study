

import java.util.List;

public class SizeCalculateVisitor implements Visitor {

	private int size = 0;
	
	public int getSize() {
		return this.size;
	}
	
	@Override
	public void visit(File file) {
		size += file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		List<Element> elements = directory.getList();
		
		for (Element element : elements) {
			element.accept(this);
		}
	}
}
