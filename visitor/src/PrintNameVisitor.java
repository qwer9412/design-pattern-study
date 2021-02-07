

import java.util.List;

public class PrintNameVisitor implements Visitor {

	private String curLocationName = "";
	
	@Override
	public void visit(File file) {
		System.out.println(curLocationName + "/" + file.getName());
	}

	@Override
	public void visit(Directory directory) {
		String tmp = curLocationName;
		curLocationName += "/" + directory.getName();
		System.out.println(curLocationName);
		
		List<Element> elements = directory.getList();
		for (Element element : elements) {
			element.accept(this);
		}
		
		curLocationName = tmp;
	}
}
